package com.groupfour.clueserver.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
                    // Consumir el repository
    @Autowired
    private OrderRepository orderRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<OrderModel> findAll() {
        return orderRepository.findAll();
    }

    // Metodo read
    public OrderModel findById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public OrderModel save(OrderModel entity) {
        return orderRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        orderRepository.deleteById(id);
    }
}
