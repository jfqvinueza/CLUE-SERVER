package com.groupfour.clueserver.customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerModel, Integer>{
    List<CustomerModel> findAll();
}
