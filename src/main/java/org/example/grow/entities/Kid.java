package org.example.grow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Kid {

    @Id @GeneratedValue
    private Long id;
    private String name;

}
