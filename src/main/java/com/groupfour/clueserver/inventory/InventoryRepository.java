package com.groupfour.clueserver.inventory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<InventoryModel, Integer>{
    List<InventoryModel> findAll();
}
