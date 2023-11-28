package com.groupfour.clueserver.shoppingCar;

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

@Tag(name = "Controlador shoppingCar (shoppingCars)", description = "Tabla shoppingCars")
@RestController
@RequestMapping("/app/shoppingCar")
@CrossOrigin({"*"})
public class ShoppingCarController {
        //Consumir el servicio
    @Autowired
    private ShoppingCarService shoppingCarService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere shoppingCar_Write")    
    @PreAuthorize("hasAuthority('shoppingCar_Write')")
    @PostMapping("/create")
    public ShoppingCarModel save(@RequestBody ShoppingCarModel entity)
    {
        return shoppingCarService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere shoppingCar_Read")
    @PreAuthorize("hasAuthority('shoppingCar_Read')")
    @GetMapping("/{id}")
    public ShoppingCarModel read(@PathVariable Integer id)
    {
        return shoppingCarService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere shoppingCar_Write")
    @PreAuthorize("hasAuthority('shoppingCar_Write')")
    @PutMapping("/{id}")
    public ShoppingCarModel update(@RequestBody ShoppingCarModel entity)
    {
        return shoppingCarService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere shoppingCar_Delete")
    @PreAuthorize("hasAuthority('shoppingCar_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        shoppingCarService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los shoppingCars, Requiere shoppingCar_Read")
    @PreAuthorize("hasAuthority('shoppingCar_Read')")
    @GetMapping("/")
    public List<ShoppingCarModel> findAll()
    {
        return shoppingCarService.findAll();
    }
}
