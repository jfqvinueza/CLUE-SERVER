package com.groupfour.clueserver.deliveries;

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
@RequestMapping("/app/deliveries")
@CrossOrigin({"*"})
public class DeliveriesController {
            //Consumir el servicio
    @Autowired
    private DeliveriesService deliveriesService;

    //Sub ruta para el create
    @PostMapping("/create")
    public DeliveriesModel save(@RequestBody DeliveriesModel entity)
    {
        return deliveriesService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public DeliveriesModel read(@PathVariable Integer id)
    {
        return deliveriesService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public DeliveriesModel update(@RequestBody DeliveriesModel entity)
    {
        return deliveriesService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        deliveriesService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<DeliveriesModel> findAll()
    {
        return deliveriesService.findAll();
    }
}
