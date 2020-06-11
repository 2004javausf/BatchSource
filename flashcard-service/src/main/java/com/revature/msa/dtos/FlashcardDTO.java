package com.revature.msa.dtos;

import com.revature.msa.entities.Flashcard;

import java.util.Objects;

public class FlashcardDTO {

    private int id;
    private String question;
    private String answer;
    private AppUserDTO creator;

    public FlashcardDTO() {
        super();
    }

    public FlashcardDTO(Flashcard card) {
        this.id = card.getId();
        this.question = card.getQuestion();
        this.answer = card.getAnswer();
        this.creator = new AppUserDTO();
        this.creator.setId(card.getCreatorId());
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

    public AppUserDTO getCreator() {
        return creator;
    }

    public void setCreator(AppUserDTO creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlashcardDTO that = (FlashcardDTO) o;
        return id == that.id &&
                Objects.equals(question, that.question) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(creator, that.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer, creator);
    }

    @Override
    public String toString() {
        return "FlashcardDTO{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", creator=" + creator +
                '}';
    }

}
