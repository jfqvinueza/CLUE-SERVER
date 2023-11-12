package com.groupfour.clueserver.deliveries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DeliveriesRepository extends CrudRepository<DeliveriesModel, Integer> {
    List<DeliveriesModel> findAll();
}
