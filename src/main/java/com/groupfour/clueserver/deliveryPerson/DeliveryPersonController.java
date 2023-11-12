package com.groupfour.clueserver.deliveryPerson;

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
@RequestMapping("/app/deliveryPerson")
@CrossOrigin({"*"})
public class DeliveryPersonController {
        //Consumir el servicio
    @Autowired
    private DeliveryPersonService deliveryPersonService;

    //Sub ruta para el create
    @PostMapping("/create")
    public DeliveryPersonModel save(@RequestBody DeliveryPersonModel entity)
    {
        return deliveryPersonService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public DeliveryPersonModel read(@PathVariable Integer id)
    {
        return deliveryPersonService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public DeliveryPersonModel update(@RequestBody DeliveryPersonModel entity)
    {
        return deliveryPersonService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        deliveryPersonService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<DeliveryPersonModel> findAll()
    {
        return deliveryPersonService.findAll();
    }
}
