package com.groupfour.clueserver.inventory;

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

@Tag(name = "Controlador inventory (inventorys)", description = "Tabla inventorys")
@RestController
@RequestMapping("/app/inventory")
@CrossOrigin({"*"})
public class InventoryController {
        //Consumir el servicio
    @Autowired
    private InventoryService InventoryModelService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere inventory_Write")    
    @PreAuthorize("hasAuthority('inventory_Write')")
    @PostMapping("/create")
    public InventoryModel save(@RequestBody InventoryModel entity)
    {
        return InventoryModelService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere inventory_Read")
    @PreAuthorize("hasAuthority('inventory_Read')")
    @GetMapping("/{id}")
    public InventoryModel read(@PathVariable Integer id)
    {
        return InventoryModelService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere inventory_Write")
    @PreAuthorize("hasAuthority('inventory_Write')")
    @PutMapping("/{id}")
    public InventoryModel update(@RequestBody InventoryModel entity)
    {
        return InventoryModelService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere inventory_Delete")
    @PreAuthorize("hasAuthority('inventory_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        InventoryModelService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los inventorys, Requiere inventory_Read")
    @PreAuthorize("hasAuthority('inventory_Read')")
    @GetMapping("/")
    public List<InventoryModel> findAll()
    {
        return InventoryModelService.findAll();
    }
}
