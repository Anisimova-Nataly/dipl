package impl;

import java.sql.SQLException;
import java.util.List;


import org.hibernate.Session;

import dao.ZyrnalYchKonsPoTelefonyDao;

import table.ZyrnalYchKonsPoTelefony;

public class ZyrnalYchKonsPoTelefonyDaoImpl implements ZyrnalYchKonsPoTelefonyDao{

	@Override
	public void addZyrnalYchKonsPoTelefony(ZyrnalYchKonsPoTelefony zur) throws SQLException {
	 Session session=null;
	 try{
		 session = util.HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		 session.save(zur);
		 session.getTransaction().commit();
	 }catch(Exception e){
		 e.printStackTrace();
	 }finally{
		 if((session!=null)&&(session.isOpen())){session.close();}
	 }
	}

	@Override
	public void deleteZyrnalYchKonsPoTelefony(ZyrnalYchKonsPoTelefony zur) throws SQLException {
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 session.beginTransaction();
			 session.delete(zur);
			 session.getTransaction().commit();
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		}

		


	@Override
	public ZyrnalYchKonsPoTelefony getZyrnalYchKonsPoTelefony(int id) throws SQLException {
		ZyrnalYchKonsPoTelefony rez= null;
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 rez= session.get(ZyrnalYchKonsPoTelefony.class, id);
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		return rez;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ZyrnalYchKonsPoTelefony> getZyrnalYchKonsPoTelefonys() throws SQLException {
		List<ZyrnalYchKonsPoTelefony> Zyrnals = null;
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 Zyrnals=session.createCriteria(ZyrnalYchKonsPoTelefony.class).list();
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		return Zyrnals;
	}

}
