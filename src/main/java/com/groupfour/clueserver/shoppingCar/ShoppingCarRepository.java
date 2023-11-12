package com.groupfour.clueserver.shoppingCar;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ShoppingCarRepository extends CrudRepository<ShoppingCarModel, Integer>{
    List<ShoppingCarModel>findAll();
}
