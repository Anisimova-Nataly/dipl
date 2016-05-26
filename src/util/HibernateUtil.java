package util;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	private HibernateUtil(){ };
	
	static{
		try{sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
		}catch(Throwable e){
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	};

}
