package impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import dao.TherapeuticDiagnosticManipulationsJournalDao;
import table.TherapeuticDiagnosticManipulationsJournal;
import util.HibernateUtil;

public class TherapeuticDiagnosticManipulationsJournalDaoImpl implements TherapeuticDiagnosticManipulationsJournalDao {

	@Override
	public void addTherapeuticDiagnosticManipulationsJournal(TherapeuticDiagnosticManipulationsJournal journal) throws SQLException {
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
	public void deleteTherapeuticDiagnosticManipulationsJournal(TherapeuticDiagnosticManipulationsJournal journal) throws SQLException {
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
	public TherapeuticDiagnosticManipulationsJournal getTherapeuticDiagnosticManipulationsJournal(int id) throws SQLException {
		TherapeuticDiagnosticManipulationsJournal result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (TherapeuticDiagnosticManipulationsJournal) session.load(TherapeuticDiagnosticManipulationsJournal.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<TherapeuticDiagnosticManipulationsJournal> getTherapeuticDiagnosticManipulationsJournal() throws SQLException {
		List<TherapeuticDiagnosticManipulationsJournal> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(TherapeuticDiagnosticManipulationsJournal.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

	@Override
	public void updateTherapeuticDiagnosticManipulationsJournal(Long id, TherapeuticDiagnosticManipulationsJournal therapeuticDiagnosticManipulationsJournal) throws SQLException {
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(therapeuticDiagnosticManipulationsJournal);
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