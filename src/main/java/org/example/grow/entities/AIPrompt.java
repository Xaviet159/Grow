package org.example.grow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AIPrompt {

    @Id @GeneratedValue
    private int id;
    private String prompt;
    private String subject;
    private boolean answerAllowed;
}
