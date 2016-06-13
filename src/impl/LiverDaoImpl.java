package impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import dao.LiverDao;
import table.Liver;
import util.HibernateUtil;

public class LiverDaoImpl implements LiverDao {

	@Override
	public void addLiver(Liver journal) throws SQLException {
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
	public void deleteLiver(Liver journal) throws SQLException {
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
	public Liver getLiver(int id) throws SQLException {
		Liver result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Liver) session.load(Liver.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<Liver> getLiver() throws SQLException {
		List<Liver> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(Liver.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

	@Override
	public void updateLiver(Long id, Liver liver) throws SQLException {
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(liver);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		
	}

}