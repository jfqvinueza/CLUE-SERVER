package com.groupfour.clueserver.deliveries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveriesService {
        // Consumir el repository
    @Autowired
    private DeliveriesRepository deliveriesRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<DeliveriesModel> findAll() {
        return deliveriesRepository.findAll();
    }

    // Metodo read
    public DeliveriesModel findById(Integer id) {
        return deliveriesRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public DeliveriesModel save(DeliveriesModel entity) {
        return deliveriesRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        deliveriesRepository.deleteById(id);
    }
}
