package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.PalpationDao;
import table.Palpation;
import util.HibernateUtil;

public class PalpationDaoImpl implements PalpationDao {

	@Override
	public void addPalpation(Palpation journal) throws SQLException {
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
	public void deletePalpation(Palpation journal) throws SQLException {
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
	public Palpation getPalpation(int id) throws SQLException {
		Palpation result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Palpation) session.load(Palpation.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<Palpation> getPalpation() throws SQLException {
		List<Palpation> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(Palpation.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

}