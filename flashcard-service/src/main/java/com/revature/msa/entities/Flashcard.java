package com.revature.msa.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="flashcards")
public class Flashcard {
    
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable=false)
    private String question;
    
    @Column(nullable=false)
    private String answer;

    @Column(name="creator_id", nullable=false)
    private int creatorId;

    public Flashcard() {
        super();
    }
    
    public Flashcard(int id, String question, String answer, int creatorId) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.creatorId = creatorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flashcard flashcard = (Flashcard) o;
        return id == flashcard.id &&
                creatorId == flashcard.creatorId &&
                Objects.equals(question, flashcard.question) &&
                Objects.equals(answer, flashcard.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer, creatorId);
    }

    @Override
    public String toString() {
        return "Flashcard{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", creatorId=" + creatorId +
                '}';
    }
    
}
