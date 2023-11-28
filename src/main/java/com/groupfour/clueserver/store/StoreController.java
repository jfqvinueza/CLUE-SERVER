package com.groupfour.clueserver.store;

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

@Tag(name = "Controlador store (stores)", description = "Tabla stores")
@RestController
@RequestMapping("/app/store")
@CrossOrigin({"*"})
public class StoreController {
      //Consumir el servicio
    @Autowired
    private StoreService storeService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere store_Write")    
    @PreAuthorize("hasAuthority('store_Write')")
    @PostMapping("/create")
    public StoreModel save(@RequestBody StoreModel entity)
    {
        return storeService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere store_Read")
    @PreAuthorize("hasAuthority('store_Read')")
    @GetMapping("/{id}")
    public StoreModel read(@PathVariable Integer id)
    {
        return storeService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere store_Write")
    @PreAuthorize("hasAuthority('store_Write')")
    @PutMapping("/{id}")
    public StoreModel update(@RequestBody StoreModel entity)
    {
        return storeService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere store_Delete")
    @PreAuthorize("hasAuthority('store_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        storeService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los stores, Requiere store_Read")
    @PreAuthorize("hasAuthority('store_Read')")
    @GetMapping("/")
    public List<StoreModel> findAll()
    {
        return storeService.findAll();
    }  
}
