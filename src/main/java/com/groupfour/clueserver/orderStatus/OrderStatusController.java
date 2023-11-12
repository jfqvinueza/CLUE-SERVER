package com.groupfour.clueserver.orderStatus;

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
@RequestMapping("/app/orderStatus")
@CrossOrigin({"*"})
public class OrderStatusController {
        //Consumir el servicio
    @Autowired
    private OrderStatusService orderStatusService;

    //Sub ruta para el create
    @PostMapping("/create")
    public OrderStatusModel save(@RequestBody OrderStatusModel entity)
    {
        return orderStatusService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public OrderStatusModel read(@PathVariable Integer id)
    {
        return orderStatusService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public OrderStatusModel update(@RequestBody OrderStatusModel entity)
    {
        return orderStatusService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        orderStatusService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<OrderStatusModel> findAll()
    {
        return orderStatusService.findAll();
    }
}
