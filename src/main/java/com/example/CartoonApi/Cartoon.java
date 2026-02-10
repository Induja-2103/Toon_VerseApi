package com.example.CartoonApi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Cartoon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dialogue;
    private String fact;
    private float rating;
    private String img;
    public Cartoon() {
    }

    public Cartoon(Long id, String name, String dialogue, String fact, float rating, String img) {
        this.id = id;
        this.name = name;
        this.dialogue = dialogue;
        this.fact = fact;
        this.rating = rating;
        this.img = img;
    }


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


    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }


    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }


    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}