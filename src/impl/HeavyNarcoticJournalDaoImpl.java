package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.HeavyNarcoticJournalDao;
import table.HeavyNarcoticJournal;
import util.HibernateUtil;

public class HeavyNarcoticJournalDaoImpl implements HeavyNarcoticJournalDao {

	@Override
	public void addHeavyNarcoticJournal(HeavyNarcoticJournal journal) throws SQLException {
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
	public void deleteHeavyNarcoticJournal(HeavyNarcoticJournal journal) throws SQLException {
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
	public HeavyNarcoticJournal getHeavyNarcoticJournal(int id) throws SQLException {
		HeavyNarcoticJournal result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (HeavyNarcoticJournal) session.load(HeavyNarcoticJournal.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<HeavyNarcoticJournal> getHeavyNarcoticJournals() throws SQLException {
		List<HeavyNarcoticJournal> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(HeavyNarcoticJournal.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

}
