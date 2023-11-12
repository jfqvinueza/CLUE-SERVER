package com.groupfour.clueserver.order;

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
@RequestMapping("/app/order")
@CrossOrigin({"*"})
public class OrderController {
        //Consumir el servicio
    @Autowired
    private OrderService orderService;

    //Sub ruta para el create
    @PostMapping("/create")
    public OrderModel save(@RequestBody OrderModel entity)
    {
        return orderService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public OrderModel read(@PathVariable Integer id)
    {
        return orderService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public OrderModel update(@RequestBody OrderModel entity)
    {
        return orderService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        orderService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<OrderModel> findAll()
    {
        return orderService.findAll();
    }
}
