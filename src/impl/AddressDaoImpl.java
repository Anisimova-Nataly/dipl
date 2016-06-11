package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.AddressDao;
import table.Address;
import util.HibernateUtil;

public class AddressDaoImpl implements AddressDao {

	@Override
	public void addAddress(Address journal) throws SQLException {
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
	public void deleteAddress(Address journal) throws SQLException {
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
	public Address getAddress(int id) throws SQLException {
		Address result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Address) session.load(Address.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<Address> getAddress() throws SQLException {
		List<Address> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(Address.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

}