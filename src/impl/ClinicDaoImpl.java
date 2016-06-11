package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.ClinicDao;
import table.Clinic;
import util.HibernateUtil;

public class ClinicDaoImpl implements ClinicDao {

	@Override
	public void addClinic(Clinic journal) throws SQLException {
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
	public void deleteClinic(Clinic journal) throws SQLException {
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
	public Clinic getClinic(int id) throws SQLException {
		Clinic result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Clinic) session.load(Clinic.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<Clinic> getClinic() throws SQLException {
		List<Clinic> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(Clinic.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

}