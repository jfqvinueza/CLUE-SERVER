package com.groupfour.clueserver.store;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface StoreRepository extends CrudRepository<StoreModel, Integer>{
        List<StoreModel> findAll();
}
