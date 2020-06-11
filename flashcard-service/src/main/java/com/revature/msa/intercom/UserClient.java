package com.revature.msa.intercom;

import com.revature.msa.dtos.AppUserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/users")
@FeignClient(name="user-service")
public interface UserClient {

    @GetMapping
    List<AppUserDTO> getAllUsers();

    @GetMapping("/id/{id}")
    AppUserDTO getUserById(@PathVariable int id);

}
