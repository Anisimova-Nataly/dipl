package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import dao.EvaluationXbsShvoDao;
import table.EvaluationXbsShvo;
import util.HibernateUtil;

public class EvaluationXbsShvoDaoImpl implements EvaluationXbsShvoDao {

	@Override
	public void addEvaluationXbsShvo(EvaluationXbsShvo journal) throws SQLException {
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
	public void deleteEvaluationXbsShvo(EvaluationXbsShvo journal) throws SQLException {
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
	public EvaluationXbsShvo getEvaluationXbsShvo(int id) throws SQLException {
		EvaluationXbsShvo result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (EvaluationXbsShvo) session.load(EvaluationXbsShvo.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return result;
	}

	@Override
	public List<EvaluationXbsShvo> getEvaluationXbsShvo() throws SQLException {
		List<EvaluationXbsShvo> Journals = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			Journals = session.createCriteria(EvaluationXbsShvo.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null) && (session.isOpen()))session.close();
		}
		return Journals;
	}
}

