package com.groupfour.clueserver.deliveryAddresses;

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
@RequestMapping("/app/delivery_address")
@CrossOrigin({"*"})
public class DeliveryAddressesController {
        //Consumir el servicio
    
    @Autowired
    private DeliveryAddressesService deliveryAddressesService;

    // Sub ruta para el create
    @PostMapping("/create")
    public DeliveryAddressesModel save(@RequestBody DeliveryAddressesModel entity) {
        return deliveryAddressesService.save(entity);
    }

    // Sub ruta para el read
    @GetMapping("/{id}")
    public DeliveryAddressesModel read(@PathVariable Integer id) {
        return deliveryAddressesService.findById(id);
    }

    // Sub ruta para el update
    @PutMapping("/{id}")
    public DeliveryAddressesModel update(@RequestBody DeliveryAddressesModel entity) {
        return deliveryAddressesService.save(entity);
    }

    // Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        deliveryAddressesService.deleteById(id);
    }

    // Sub ruta para el read all
    @GetMapping("/")
    public List<DeliveryAddressesModel> findAll() {
        return deliveryAddressesService.findAll();
    }
}
