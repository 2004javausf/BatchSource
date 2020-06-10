package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.TRex;
import com.revature.repository.TRexDAO;

@Service
public class TRexService {
	@Autowired
	private TRexDAO trd;
	
	public List<TRex> getAllTRexes(){
		return trd.findAll();
	}
	
	public void addTRex(TRex trex) {
		trd.save(trex);
	}
}
