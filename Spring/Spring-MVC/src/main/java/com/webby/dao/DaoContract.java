package com.webby.dao;

import java.util.List;

public interface DaoContract<T,I> {

	List<T> findAll();
	T findById(I i);
	void insert(T t);
}
