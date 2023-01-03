package com.dynamic_cards.dynamic.card.demostration.repositories;


import com.dynamic_cards.dynamic.card.demostration.model.products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productsRepository extends JpaRepository<products, Integer> {

    public List<products> findAll();

}
