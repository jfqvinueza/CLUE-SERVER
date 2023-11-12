package com.groupfour.clueserver.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    // Consumir el repository
    @Autowired
    private CustomerRepository customerRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<CustomerModel> findAll() {
        return customerRepository.findAll();
    }

    // Metodo read
    public CustomerModel findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public CustomerModel save(CustomerModel entity) {
        return customerRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }
}
