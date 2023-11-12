package com.groupfour.clueserver.paymentMethod;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PaymentMethodRepository extends CrudRepository<PaymentMethodModel, Integer>{
    List<PaymentMethodModel> findAll();
}
