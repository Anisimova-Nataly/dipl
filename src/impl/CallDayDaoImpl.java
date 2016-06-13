package impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import dao.CallDayDao;
import table.CallDay;
import util.HibernateUtil;

public class CallDayDaoImpl implements CallDayDao {

	@Override
	public void addCallDay(CallDay journal) throws SQLException {
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
	public void deleteCallDay(CallDay journal) throws SQLException {
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
	public CallDay getCallDay(int id) throws SQLException {
		CallDay result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (CallDay) session.load(CallDay.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<CallDay> getCallDay() throws SQLException {
		List<CallDay> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(CallDay.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

	@Override
	public void updateCallDay(Long id, CallDay callDay) throws SQLException {
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(callDay);
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