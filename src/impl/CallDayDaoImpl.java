package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.CallDayDao;
import table.CallDay;
import util.HibernateUtil;

public class CallDayDaoImpl implements CallDayDao {

	@Override
	public void addCallDay(CallDay list) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(list);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		session.close();
	}

	@Override
	public void deleteCallDay(CallDay list) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(list);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		session.close();
		
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
		List<CallDay> lists = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			lists = session.createCriteria(CallDay.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return lists;
	}

}
