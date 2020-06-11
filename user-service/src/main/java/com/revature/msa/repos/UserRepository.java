package com.revature.msa.repos;

import com.revature.msa.entities.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Integer> {
    AppUser findAppUserByUsername(String username);
}
