package com.groupfour.clueserver.deliveries;

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

@Tag(name = "Controlador deliveries (deliveriess)", description = "Tabla deliveriess")
@RestController
@RequestMapping("/app/deliveries")
@CrossOrigin({"*"})
public class DeliveriesController {
            //Consumir el servicio
    @Autowired
    private DeliveriesService deliveriesService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere deliveries_Write")    
    @PreAuthorize("hasAuthority('deliveries_Write')")
    @PostMapping("/create")
    public DeliveriesModel save(@RequestBody DeliveriesModel entity)
    {
        return deliveriesService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere deliveries_Read")
    @PreAuthorize("hasAuthority('deliveries_Read')")
    @GetMapping("/{id}")
    public DeliveriesModel read(@PathVariable Integer id)
    {
        return deliveriesService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere deliveries_Write")
    @PreAuthorize("hasAuthority('deliveries_Write')")
    @PutMapping("/{id}")
    public DeliveriesModel update(@RequestBody DeliveriesModel entity)
    {
        return deliveriesService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere deliveries_Delete")
    @PreAuthorize("hasAuthority('deliveries_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        deliveriesService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los deliveriess, Requiere deliveries_Read")
    @PreAuthorize("hasAuthority('deliveries_Read')")
    @GetMapping("/")
    public List<DeliveriesModel> findAll()
    {
        return deliveriesService.findAll();
    }
}
