package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.TyazestDao;
import table.Tyazest;
import util.HibernateUtil;

public class TyazestDaoImpl implements TyazestDao {

	@Override
	public void addTyazest(Tyazest journal) throws SQLException {
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
	public void deleteTyazest(Tyazest journal) throws SQLException {
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
	public Tyazest getTyazest(int id) throws SQLException {
		Tyazest result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Tyazest) session.load(Tyazest.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<Tyazest> getTyazest() throws SQLException {
		List<Tyazest> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(Tyazest.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

}