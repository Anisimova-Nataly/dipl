package impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import dao.TheartDao;
import table.Theart;
import util.HibernateUtil;

public class TheartDaoImpl implements TheartDao {

	@Override
	public void addTheart(Theart journal) throws SQLException {
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
	public void deleteTheart(Theart journal) throws SQLException {
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
	public Theart getTheart(int id) throws SQLException {
		Theart result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Theart) session.load(Theart.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<Theart> getTheart() throws SQLException {
		List<Theart> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(Theart.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

	@Override
	public void updateTheart(Long id, Theart theart) throws SQLException {
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(theart);
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