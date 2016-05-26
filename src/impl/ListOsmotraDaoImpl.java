package impl;

import java.sql.SQLException;
import java.util.List;


import org.hibernate.Session;

import dao.ListOsmotraDao;

import table.ListOsmotra;

public class ListOsmotraDaoImpl implements ListOsmotraDao{

	@Override
	public void addListOsmotra(ListOsmotra zur) throws SQLException {
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
	public void deleteListOsmotra(ListOsmotra zur) throws SQLException {
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
	public ListOsmotra getListOsmotra(int id) throws SQLException {
		ListOsmotra rez= null;
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 rez= session.get(ListOsmotra.class, id);
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		return rez;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ListOsmotra> getListOsmotras() throws SQLException {
		List<ListOsmotra> Zyrnals = null;
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 Zyrnals=session.createCriteria(ListOsmotra.class).list();
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		return Zyrnals;
	}

}
