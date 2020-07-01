package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Message;
import com.revature.beans.TRex;
import com.revature.service.TRexService;

@RestController
@RequestMapping(value="/trex")
@CrossOrigin(origins="http://localhost:4200")
public class TRexController {
	
	@Autowired
	private TRexService trs;
	
	@ResponseStatus(HttpStatus.OK)//this will be default. don't really need
	@GetMapping("/all")
	public List<TRex> getAllTRexes(){
		return  trs.getAllTRexes();
		
	}
	
	@ResponseStatus(HttpStatus.CREATED)//201 created new row
	@PostMapping("")
	public Message addTrex(@RequestBody TRex trex){
			trs.addTRex(trex);
			return new Message("T-REX CREATED SUCCESSFULY");	
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler
	public Message handleException(Exception e) {
		return new Message("FAILED TO CREATE T-REX");
	}
}
