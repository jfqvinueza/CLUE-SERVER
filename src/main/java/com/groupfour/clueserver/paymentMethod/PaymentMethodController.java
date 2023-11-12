package com.groupfour.clueserver.paymentMethod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/app/paymentMethod")
@CrossOrigin({"*"})
public class PaymentMethodController {
        //Consumir el servicio
    @Autowired
    private PaymentMethodService paymentMethodService;

    //Sub ruta para el create
    @PostMapping("/create")
    public PaymentMethodModel save(@RequestBody PaymentMethodModel entity)
    {
        return paymentMethodService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public PaymentMethodModel read(@PathVariable Integer id)
    {
        return paymentMethodService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public PaymentMethodModel update(@RequestBody PaymentMethodModel entity)
    {
        return paymentMethodService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        paymentMethodService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<PaymentMethodModel> findAll()
    {
        return paymentMethodService.findAll();
    }
}
