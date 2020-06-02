/*
* @author Peter Alagna
*/

package com.revature.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.model.Trainer;
import com.revature.util.ConnectionUtil;

public class TrainerRepositoryHibernate implements TrainerRepository {
	public void testNamedQuery() {
		//Query query= .createNamedQuery("nameOFQuery",Trainer.class);
	}
	
	
	@Override
	public int save(Trainer trainer) {
		Session session = ConnectionUtil.getSession();
		session.beginTransaction();
		Integer generatedId = (Integer) session.save(trainer);
		session.getTransaction().commit();
		return generatedId;
	}

	@Override
	public Trainer findByName(String name) {
		return (Trainer) ConnectionUtil.getSession()
				.createCriteria(Trainer.class)
				.add(Restrictions.like("name", name))
				.uniqueResult();
	}

	@Override
	public void update(Trainer trainer) {
		Session session = ConnectionUtil.getSession();
		session.beginTransaction();
		session.saveOrUpdate(trainer);
		session.getTransaction().commit();
	}

}
