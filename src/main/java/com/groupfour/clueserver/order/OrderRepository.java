package com.groupfour.clueserver.order;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderModel, Integer> {
    List<OrderModel> findAll();
}
