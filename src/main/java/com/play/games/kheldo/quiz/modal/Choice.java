package com.play.games.kheldo.quiz.modal;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Choice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String choice;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column
    private boolean isCorrect;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Date createdTime;

    @UpdateTimestamp
    private Date updatedTime;

    private String createdBy;

    private String updatedBy;

}
