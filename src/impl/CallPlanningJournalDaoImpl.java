package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.CallPlanningJournalDao;
import table.CallPlanningJournal;
import util.HibernateUtil;

public class CallPlanningJournalDaoImpl implements CallPlanningJournalDao {

	@Override
	public void addCallPlanningJournal(CallPlanningJournal journal) throws SQLException {
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
	public void deleteCallPlanningJournal(CallPlanningJournal journal) throws SQLException {
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
	public CallPlanningJournal getCallPlanningJournal(int id) throws SQLException {
		CallPlanningJournal result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (CallPlanningJournal) session.load(CallPlanningJournal.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<CallPlanningJournal> getCallPlanningJournal() throws SQLException {
		List<CallPlanningJournal> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(CallPlanningJournal.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

}
