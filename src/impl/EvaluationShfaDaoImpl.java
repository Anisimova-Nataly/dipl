package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.EvaluationShfaDao;
import table.EvaluationShfa;
import util.HibernateUtil;

public class EvaluationShfaDaoImpl implements EvaluationShfaDao {

	@Override
	public void addEvaluationShfa(EvaluationShfa journal) throws SQLException {
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
	public void deleteEvaluationShfa(EvaluationShfa journal) throws SQLException {
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
	public EvaluationShfa getEvaluationShfa(int id) throws SQLException {
		EvaluationShfa result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (EvaluationShfa) session.load(EvaluationShfa.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<EvaluationShfa> getEvaluationShfa() throws SQLException {
		List<EvaluationShfa> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(EvaluationShfa.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}

}