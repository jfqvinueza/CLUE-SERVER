package com.groupfour.clueserver.deliveryPerson;

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

@Tag(name = "Controlador deliveryPerson (deliveryPersons)", description = "Tabla deliveryPersons")
@RestController
@RequestMapping("/app/deliveryPerson")
@CrossOrigin({"*"})
public class DeliveryPersonController {
        //Consumir el servicio
    @Autowired
    private DeliveryPersonService deliveryPersonService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere deliveryPerson_Write")    
    @PreAuthorize("hasAuthority('deliveryPerson_Write')")
    @PostMapping("/create")
    public DeliveryPersonModel save(@RequestBody DeliveryPersonModel entity)
    {
        return deliveryPersonService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere deliveryPerson_Read")
    @PreAuthorize("hasAuthority('deliveryPerson_Read')")
    @GetMapping("/{id}")
    public DeliveryPersonModel read(@PathVariable Integer id)
    {
        return deliveryPersonService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere deliveryPerson_Write")
    @PreAuthorize("hasAuthority('deliveryPerson_Write')")
    @PutMapping("/{id}")
    public DeliveryPersonModel update(@RequestBody DeliveryPersonModel entity)
    {
        return deliveryPersonService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere deliveryPerson_Delete")
    @PreAuthorize("hasAuthority('deliveryPerson_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        deliveryPersonService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los deliveryPersons, Requiere deliveryPerson_Read")
    @PreAuthorize("hasAuthority('deliveryPerson_Read')")
    @GetMapping("/")
    public List<DeliveryPersonModel> findAll()
    {
        return deliveryPersonService.findAll();
    }
}
