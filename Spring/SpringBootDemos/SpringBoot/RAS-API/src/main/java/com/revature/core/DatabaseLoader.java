package com.revature.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.revature.associate.Associate;
import com.revature.associate.AssociateRepository;

@Component
public class DatabaseLoader implements ApplicationRunner{

	@Autowired
	AssociateRepository assocRepo;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		
		List<Associate> associateList = Arrays.asList(
					new Associate(1,"Steve6","123",1,false,new String[]{"ROLE_USER"}),
					new Associate(2,"Steve7","123",1,true,new String[]{"ROLE_USER"})
				);
		
		assocRepo.save(associateList);
	}

	
	
}
