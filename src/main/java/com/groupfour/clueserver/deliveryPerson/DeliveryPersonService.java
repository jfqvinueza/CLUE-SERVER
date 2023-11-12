package com.groupfour.clueserver.deliveryPerson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPersonService {
            // Consumir el repository
    @Autowired
    private DeliveryPersonRepository deliveryPersonRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<DeliveryPersonModel> findAll() {
        return deliveryPersonRepository.findAll();
    }

    // Metodo read
    public DeliveryPersonModel findById(Integer id) {
        return deliveryPersonRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public DeliveryPersonModel save(DeliveryPersonModel entity) {
        return deliveryPersonRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        deliveryPersonRepository.deleteById(id);
    }
}
