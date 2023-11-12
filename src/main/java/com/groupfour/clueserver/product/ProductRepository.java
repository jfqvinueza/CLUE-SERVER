package com.groupfour.clueserver.product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel, Integer> {
    List<ProductModel> findAll();
}
