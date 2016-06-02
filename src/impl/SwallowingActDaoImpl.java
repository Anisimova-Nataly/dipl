package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.SwallowingActDao;
import table.SwallowingAct;
import util.HibernateUtil;

public class SwallowingActDaoImpl implements SwallowingActDao {

	@Override
	public void addSwallowingAct(SwallowingAct journal) throws SQLException {
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
	public void deleteSwallowingAct(SwallowingAct journal) throws SQLException {
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
	public SwallowingAct getSwallowingAct(int id) throws SQLException {
		SwallowingAct result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (SwallowingAct) session.load(SwallowingAct.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<SwallowingAct> getSwallowingAct() throws SQLException {
		List<SwallowingAct> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(SwallowingAct.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}
}