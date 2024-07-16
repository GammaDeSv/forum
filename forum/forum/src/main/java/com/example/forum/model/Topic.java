package com.example.forum.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "topics")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String message;

    private LocalDateTime creationDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String author;

    private String course;

    public enum Status {
        OPEN,
        CLOSED,
        PENDING
    }
}
