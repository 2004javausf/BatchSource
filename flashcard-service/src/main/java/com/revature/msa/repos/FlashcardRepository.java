package com.revature.msa.repos;

import com.revature.msa.entities.Flashcard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepository extends CrudRepository<Flashcard, Integer> {
}
