package com.hib.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.model.Trainee;
import com.hibernate.util.HibernateUtil;

public class TraineeDaoImpl implements TraineeDao{
	public void createTrainee(Trainee t) {
		SessionFactory sessionFactory = null;
		Session s = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		try {
			if(sessionFactory != null) {
				s = sessionFactory.openSession();
				s.getTransaction().begin();
				s.save(t);
				s.getTransaction().commit();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


/*Steps to manually add queries to hibernate
 * 
 * open session
 * Criteria crit = session.createCriteria(Employee.class);
 * crit.add();
 * List list = crit.list();
 * 
 * List of criteria:
 * Restrictions.eq();
 * Restrictions.ilike();
 * Restrictions.between();
 * Restrictions.and();
 *  
 */