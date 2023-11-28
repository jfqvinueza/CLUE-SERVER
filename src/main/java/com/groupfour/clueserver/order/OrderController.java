package com.groupfour.clueserver.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Controlador order (orders)", description = "Tabla orders")
@RestController
@RequestMapping("/app/order")
@CrossOrigin({"*"})
public class OrderController {
        //Consumir el servicio
    @Autowired
    private OrderService orderService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere order_Write")    
    @PreAuthorize("hasAuthority('order_Write')")
    @PostMapping("/create")
    public OrderModel save(@RequestBody OrderModel entity)
    {
        return orderService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere order_Read")
    @PreAuthorize("hasAuthority('order_Read')")
    @GetMapping("/{id}")
    public OrderModel read(@PathVariable Integer id)
    {
        return orderService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere order_Write")
    @PreAuthorize("hasAuthority('order_Write')")
    @PutMapping("/{id}")
    public OrderModel update(@RequestBody OrderModel entity)
    {
        return orderService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere order_Delete")
    @PreAuthorize("hasAuthority('order_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        orderService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los orders, Requiere order_Read")
    @PreAuthorize("hasAuthority('order_Read')")
    @GetMapping("/")
    public List<OrderModel> findAll()
    {
        return orderService.findAll();
    }
}
