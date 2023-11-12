package com.groupfour.clueserver.categoryProduct;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoryProductRepository extends CrudRepository<CategoryProductModel, Integer> {
    List<CategoryProductModel> findAll();
}
