package com.aop;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.model.Singer;

public class Driver {

	public static void main(String[] args) throws IOException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-aspect.xml");
		Singer singer = ac.getBean(Singer.class);
		singer.singOceanMan(); 
//		singer.yellAtAssociates();
	}
}
