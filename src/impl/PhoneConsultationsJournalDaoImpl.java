package impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import dao.PhoneConsultationsJournalDao;
import table.PhoneConsultationsJournal;
import util.HibernateUtil;

public class PhoneConsultationsJournalDaoImpl implements PhoneConsultationsJournalDao {

	@Override
	public void addPhoneConsultationsJournal(PhoneConsultationsJournal journal) throws SQLException {
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
	public void deletePhoneConsultationsJournal(PhoneConsultationsJournal journal) throws SQLException {
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
	public PhoneConsultationsJournal getPhoneConsultationsJournal(int id) throws SQLException {
		PhoneConsultationsJournal result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (PhoneConsultationsJournal) session.load(PhoneConsultationsJournal.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<PhoneConsultationsJournal> getPhoneConsultationsJournal() throws SQLException {
		List<PhoneConsultationsJournal> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(PhoneConsultationsJournal.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

	@Override
	public void updatePhoneConsultationsJournal(Long id, PhoneConsultationsJournal phoneConsultationsJournal) throws SQLException {
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(phoneConsultationsJournal);
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