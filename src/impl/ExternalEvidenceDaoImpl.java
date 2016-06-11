package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.ExternalEvidenceDao;
import table.ExternalEvidence;
import util.HibernateUtil;

public class ExternalEvidenceDaoImpl implements ExternalEvidenceDao {

	@Override
	public void addExternalEvidence(ExternalEvidence journal) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(journal);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		//session.close();
	}

	@Override
	public void deleteExternalEvidence(ExternalEvidence journal) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(journal);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		//session.close();
		
	}

	@Override
	public ExternalEvidence getExternalEvidence(int id) throws SQLException {
		ExternalEvidence result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (ExternalEvidence) session.load(ExternalEvidence.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<ExternalEvidence> getExternalEvidence() throws SQLException {
		List<ExternalEvidence> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(ExternalEvidence.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}
}