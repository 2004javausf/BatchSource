package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.TvDao;
import com.orm.model.Tvshow;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("matts-bank-account.xml");
		TvDao td = ac.getBean(TvDao.class);
		td.insert(new Tvshow(0, "ren and stimpy", "classic", 21));
		System.out.println(td.get(1));
	}

}
