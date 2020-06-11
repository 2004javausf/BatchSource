package com.revature.msa.controllers;

import com.revature.msa.dtos.FlashcardDTO;
import com.revature.msa.services.FlashcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flashcards")
public class FlashcardController {
    
    private FlashcardService cardService;

    @Autowired
    public FlashcardController(FlashcardService service) {
        this.cardService = service;
    }

    @GetMapping
    public List<FlashcardDTO> getAllCards() {
        return cardService.getAllCards();
    }
    
}
