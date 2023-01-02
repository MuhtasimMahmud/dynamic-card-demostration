package com.dynamic_cards.dynamic.card.demostration.model;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class products {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String bio;


    public products(){

    }

    public products(int id, String name, String email, String bio) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bio = bio;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
