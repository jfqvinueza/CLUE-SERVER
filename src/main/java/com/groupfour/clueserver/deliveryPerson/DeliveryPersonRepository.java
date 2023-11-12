package com.groupfour.clueserver.deliveryPerson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DeliveryPersonRepository extends CrudRepository<DeliveryPersonModel, Integer> {
    List<DeliveryPersonModel> findAll();
}
