package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.JournalOutpatientReceptionDao;
import table.JournalOutpatientReception;
import util.HibernateUtil;

public class JournalOutpatientReceptionDaoImpl implements JournalOutpatientReceptionDao {

	@Override
	public void addJournalOutpatientReception(JournalOutpatientReception journal) throws SQLException {
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
		session.close();
	}

	@Override
	public void deleteJournalOutpatientReception(JournalOutpatientReception journal) throws SQLException {
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
		session.close();
		
	}

	@Override
	public JournalOutpatientReception getJournalOutpatientReception(int id) throws SQLException {
		JournalOutpatientReception result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (JournalOutpatientReception) session.load(JournalOutpatientReception.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<JournalOutpatientReception> getJournalOutpatientReceptions() throws SQLException {
		List<JournalOutpatientReception> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(JournalOutpatientReception.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

}
