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


    

}
