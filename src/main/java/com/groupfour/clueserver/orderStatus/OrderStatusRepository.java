package com.groupfour.clueserver.orderStatus;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderStatusRepository extends CrudRepository<OrderStatusModel, Integer> {
    List<OrderStatusModel> findAll();
}
