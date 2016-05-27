package impl;

import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.List;


import org.hibernate.Session;

import dao.ListOsmotraDao;

import table.ListOsmotra;

public class ListOsmotraDaoImpl implements ListOsmotraDao{

	@Override
	public void addListOsmotra(ListOsmotra list) throws SQLException {
	 Session session=null;
	 try{
		 session = util.HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		 list.setDateTime();
		 session.save(list);
		 session.getTransaction().commit();
	 }catch(Exception e){
		 e.printStackTrace();
	 }finally{
		 if((session!=null)&&(session.isOpen())){session.close();}
	 }
	}

	@Override
	public void deleteListOsmotra(ListOsmotra list) throws SQLException {
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 session.beginTransaction();
			 session.delete(list);
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
		List<ListOsmotra> Lists = null;
		Session session=null;
		 try{
			 session = util.HibernateUtil.getSessionFactory().openSession();
			 Lists=session.createCriteria(ListOsmotra.class).list();
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 if((session!=null)&&(session.isOpen())){session.close();}
		 }
		return Lists;
	}

}
