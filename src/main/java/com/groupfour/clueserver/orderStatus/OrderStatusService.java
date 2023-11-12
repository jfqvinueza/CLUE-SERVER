package com.groupfour.clueserver.orderStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusService {
                        // Consumir el repository
    @Autowired
    private OrderStatusRepository orderStatusRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<OrderStatusModel> findAll() {
        return orderStatusRepository.findAll();
    }

    // Metodo read
    public OrderStatusModel findById(Integer id) {
        return orderStatusRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public OrderStatusModel save(OrderStatusModel entity) {
        return orderStatusRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        orderStatusRepository.deleteById(id);
    }
}
