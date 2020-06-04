package com.orm.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orm.model.Tvshow;

@Repository
@Transactional
public class TvDao {

	private SessionFactory sesfact;
	
	@Autowired
	public TvDao(SessionFactory ses) {
		this.sesfact=ses;
	}
//	@Transactional
	public void insert(Tvshow tv) {
//		Session ses = sesfact.openSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(tv);
//		tx.commit();
		sesfact.getCurrentSession().save(tv);
	}
	
	public Tvshow get(int id) {
		Session ses = sesfact.openSession();
		return ses.get(Tvshow.class, id);
	}
}
