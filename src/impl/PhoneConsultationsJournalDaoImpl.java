package impl;

import java.sql.SQLException;
import java.util.List;


import org.hibernate.Session;

import dao.PhoneConsultationsJournalDao;

import table.PhoneConsultationsJournal;

public class PhoneConsultationsJournalDaoImpl implements PhoneConsultationsJournalDao{

	@Override
	public void addPhoneConsultationsJournal(PhoneConsultationsJournal zur) throws SQLException {
	 Session session=null;
	 try{
		 session = util.HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		 zur.setDate();
		 session.save(zur);
		 session.getTransaction().commit();
		 session.close();
	 }catch(Exception e){
		 e.printStackTrace();
	 }finally{
		 if((session!=null)&&(session.isOpen())){session.close();}
	 }
	 
	}

	@Override
	public void deletePhoneConsultationsJournal(PhoneConsultationsJournal zur) throws SQLException {
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 session.beginTransaction();
			 session.delete(zur);
			 session.getTransaction().commit();
			 session.close();
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		}

		


	@Override
	public PhoneConsultationsJournal getPhoneConsultationsJournal(int id) throws SQLException {
		PhoneConsultationsJournal rez= null;
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 rez= session.get(PhoneConsultationsJournal.class, id);
			 session.close();
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		return rez;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PhoneConsultationsJournal> getPhoneConsultationsJournals() throws SQLException {
		List<PhoneConsultationsJournal> Zyrnals = null;
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 Zyrnals=session.createCriteria(PhoneConsultationsJournal.class).list();
			 session.close();
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		return Zyrnals;
	}

}
