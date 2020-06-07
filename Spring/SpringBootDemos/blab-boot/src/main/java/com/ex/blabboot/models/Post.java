package com.ex.blabboot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="POST")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Post {
    @Id
    @Column(name="POST_ID", columnDefinition = "serial")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="POST_CONTENT", nullable = false)
    private String content;

    @Column(name="POST_AUTHOR", columnDefinition = "INT4", nullable = false, updatable = false)
    private int author;
}
