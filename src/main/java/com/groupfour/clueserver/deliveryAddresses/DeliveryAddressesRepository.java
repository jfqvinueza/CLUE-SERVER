package com.groupfour.clueserver.deliveryAddresses;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface DeliveryAddressesRepository extends CrudRepository<DeliveryAddressesModel, Integer> {
    List<DeliveryAddressesModel> findAll();
}
