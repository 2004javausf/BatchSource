package com.revature.msa.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.revature.msa.dtos.AppUserDTO;
import com.revature.msa.dtos.FlashcardDTO;
import com.revature.msa.entities.Flashcard;
import com.revature.msa.intercom.UserClient;
import com.revature.msa.repos.FlashcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlashcardService {

    private UserClient userClient;
    private FlashcardRepository cardRepo;
    
    @Autowired
    public FlashcardService(FlashcardRepository repo, UserClient client) {
        this.cardRepo = repo;
        this.userClient = client;
    }

    @Transactional
    @HystrixCommand(fallbackMethod="flashcardUnavailableFallback")
    public List<FlashcardDTO> getAllCards() {
        return ((List<Flashcard>) cardRepo.findAll())
                                          .stream()
                                          .map(card -> {
                                              FlashcardDTO cardDTO = new FlashcardDTO((card));
                                              AppUserDTO creator = userClient.getUserById(card.getCreatorId());
                                              cardDTO.setCreator(creator);
                                              return cardDTO;
                                          })
                                          .collect(Collectors.toList());
                
    }

    @Transactional
    public List<FlashcardDTO> flashcardUnavailableFallback() {
        System.out.println("The flashcard-service is unavailable at this time.");
        return ((List<Flashcard>) cardRepo.findAll())
                .stream()
                .map(FlashcardDTO::new)
                .collect(Collectors.toList());
    }
    
}
