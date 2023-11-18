package com.groupfour.clueserver.deliveryAddresses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryAddressesService {
    @Autowired
    private DeliveryAddressesRepository deliveryAddressesRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<DeliveryAddressesModel> findAll() {
        return deliveryAddressesRepository.findAll();
    }

    // Metodo read
    public DeliveryAddressesModel findById(Integer id) {
        return deliveryAddressesRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public DeliveryAddressesModel save(DeliveryAddressesModel entity) {
        return deliveryAddressesRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        deliveryAddressesRepository.deleteById(id);
    }

}
