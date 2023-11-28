package com.groupfour.clueserver.customer;

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

@Tag(name = "Controlador customer (customers)", description = "Tabla customers")
@RestController
@RequestMapping("/app/customer")
@CrossOrigin({"*"})
public class CustomerController {
          //Consumir el servicio
    @Autowired
    private CustomerService customerService;

    
    //Sub ruta para el read
    @Operation(summary = "Obtiene un rol por su id, Requiere customer_Read")
    @PreAuthorize("hasAuthority('customer_Read')")
    @GetMapping("/{id}")
    public CustomerModel read(@PathVariable Integer id)
    {
        return customerService.findById(id);
    }
    
    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los customers, Requiere customer_Read")
    @PreAuthorize("hasAuthority('customer_Read')")
    @GetMapping("/")
    public List<CustomerModel> findAll()
    {
        return customerService.findAll();
    }  
    
    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere customer_Write")    
    @PreAuthorize("hasAuthority('customer_Write')")
    @PostMapping("/create")
    public CustomerModel save(@RequestBody CustomerModel entity)
    {
        return customerService.save(entity);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere customer_Write")
    @PreAuthorize("hasAuthority('customer_Write')")
    @PutMapping("/{id}")
    public CustomerModel update(@RequestBody CustomerModel entity)
    {
        return customerService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere customer_Delete")
    @PreAuthorize("hasAuthority('customer_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        customerService.deleteById(id);
    }

}
