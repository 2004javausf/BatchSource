package com.revature.msa.services;

import com.revature.msa.dtos.AppUserDTO;
import com.revature.msa.entities.AppUser;
import com.revature.msa.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepo;

    @Autowired
    public UserService(UserRepository repo) {
        this.userRepo = repo;
    }

    @Transactional
    public List<AppUserDTO> getAllUsers() {

        // Declarative logic
        return ((List<AppUser>) userRepo.findAll())
                                        .stream()
                                        .map(AppUserDTO::new)
                                        .collect(Collectors.toList());

        // Imperative logic
//        Iterable<AppUser> users = userRepo.findAll();
//        List<AppUserDTO> userDtos = new ArrayList<>();
//
//        for(AppUser user : users) {
//            AppUserDTO userDto = new AppUserDTO(user);
//            userDtos.add(userDto);
//        }
//
//        return userDtos;


    }

    @Transactional
    public AppUserDTO getUserById(int id) {
        AppUser user = userRepo.findById(id).orElseThrow(RuntimeException::new);
        return new AppUserDTO(user);
    }

}
