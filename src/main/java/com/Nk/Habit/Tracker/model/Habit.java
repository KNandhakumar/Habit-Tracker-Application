package com.Nk.Habit.Tracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// this keyword used to connect with our database table, it can communicate
public class Habit {
    @Id // this annotation using for,this is primary key in table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // it is generate automatically
    private Long id;
    private String name;
    private String description;
    private String completed;

    // Constructors

    public Habit() {
    }

    public Habit(String name, String description, String completed) {
        this.name = name;
        this.description = description;
        this.completed = completed;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
