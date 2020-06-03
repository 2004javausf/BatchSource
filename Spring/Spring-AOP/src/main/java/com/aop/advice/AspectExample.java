package com.aop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Revature
 *
 *	Spring AOP is an implementation of aspectj. It
 *		simplifies AspectJ, but it reduces the functionality.
 *
 *	AOP = Aspect Oriented Programming
 *		 meant to modularize cross cutting concerns
 *
 *	cross cutting concerns:
 *		tangling:	spaghetti code
 *		scattering:	logging, exception handling
 *	
 *	aspect:	
 *		takes the form of a class in spring
 *
 *	advice:
 *		takes the form of methods inside of an aspect
 *
 *
 */


@Aspect
@Component
public class AspectExample {
	
	@Before("execution(* sing*(..))")
	public void beforeSinging() {
		System.out.println("this is the advice to run before singing");
	}

}
