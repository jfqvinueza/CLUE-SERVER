package com.groupfour.clueserver.paymentMethod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentMethodService {
                            // Consumir el repository
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<PaymentMethodModel> findAll() {
        return paymentMethodRepository.findAll();
    }

    // Metodo read
    public PaymentMethodModel findById(Integer id) {
        return paymentMethodRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public PaymentMethodModel save(PaymentMethodModel entity) {
        return paymentMethodRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        paymentMethodRepository.deleteById(id);
    }
}
