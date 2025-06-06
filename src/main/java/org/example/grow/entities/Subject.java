package org.example.grow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Subject {

    @Id @GeneratedValue
    Long id;
    String name;
    int level;

}
