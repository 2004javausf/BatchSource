package com.revature.associate;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AssociateRepository extends PagingAndSortingRepository<Associate, Long>{

	Associate findByUsername(String username); 
}
