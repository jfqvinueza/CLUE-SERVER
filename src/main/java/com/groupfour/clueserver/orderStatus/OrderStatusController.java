package com.groupfour.clueserver.orderStatus;

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

@Tag(name = "Controlador orderStatus (orderStatuss)", description = "Tabla orderStatuss")
@RestController
@RequestMapping("/app/orderStatus")
@CrossOrigin({"*"})
public class OrderStatusController {
        //Consumir el servicio
    @Autowired
    private OrderStatusService orderStatusService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere orderStatus_Write")    
    @PreAuthorize("hasAuthority('orderStatus_Write')")
    @PostMapping("/create")
    public OrderStatusModel save(@RequestBody OrderStatusModel entity)
    {
        return orderStatusService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere orderStatus_Read")
    @PreAuthorize("hasAuthority('orderStatus_Read')")
    @GetMapping("/{id}")
    public OrderStatusModel read(@PathVariable Integer id)
    {
        return orderStatusService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere orderStatus_Write")
    @PreAuthorize("hasAuthority('orderStatus_Write')")
    @PutMapping("/{id}")
    public OrderStatusModel update(@RequestBody OrderStatusModel entity)
    {
        return orderStatusService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere orderStatus_Delete")
    @PreAuthorize("hasAuthority('orderStatus_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        orderStatusService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los orderStatuss, Requiere orderStatus_Read")
    @PreAuthorize("hasAuthority('orderStatus_Read')")
    @GetMapping("/")
    public List<OrderStatusModel> findAll()
    {
        return orderStatusService.findAll();
    }
}
