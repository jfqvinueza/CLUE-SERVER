package com.groupfour.clueserver.deliveryAddresses;

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

@Tag(name = "Controlador deliveryAddresses (deliveryAddressess)", description = "Tabla deliveryAddressess")
@RestController
@RequestMapping("/app/deliveryAddresses")
@CrossOrigin({"*"})
public class DeliveryAddressesController {
        //Consumir el servicio
    
    @Autowired
    private DeliveryAddressesService deliveryAddressesService;

    // Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere deliveryAddresses_Write")    
    @PreAuthorize("hasAuthority('deliveryAddresses_Write')")
    @PostMapping("/create")
    public DeliveryAddressesModel save(@RequestBody DeliveryAddressesModel entity) {
        return deliveryAddressesService.save(entity);
    }

    // Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere deliveryAddresses_Read")
    @PreAuthorize("hasAuthority('deliveryAddresses_Read')")
    @GetMapping("/{id}")
    public DeliveryAddressesModel read(@PathVariable Integer id) {
        return deliveryAddressesService.findById(id);
    }

    // Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere deliveryAddresses_Write")
    @PreAuthorize("hasAuthority('deliveryAddresses_Write')")
    @PutMapping("/{id}")
    public DeliveryAddressesModel update(@RequestBody DeliveryAddressesModel entity) {
        return deliveryAddressesService.save(entity);
    }

    // Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere deliveryAddresses_Delete")
    @PreAuthorize("hasAuthority('deliveryAddresses_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        deliveryAddressesService.deleteById(id);
    }

    // Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los deliveryAddressess, Requiere deliveryAddresses_Read")
    @PreAuthorize("hasAuthority('deliveryAddresses_Read')")
    @GetMapping("/")
    public List<DeliveryAddressesModel> findAll() {
        return deliveryAddressesService.findAll();
    }
}
