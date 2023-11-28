package com.groupfour.clueserver.paymentMethod;

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

@Tag(name = "Controlador paymentMethod (paymentMethods)", description = "Tabla paymentMethods")
@RestController
@RequestMapping("/app/paymentMethod")
@CrossOrigin({"*"})
public class PaymentMethodController {
        //Consumir el servicio
    @Autowired
    private PaymentMethodService paymentMethodService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere paymentMethod_Write")    
    @PreAuthorize("hasAuthority('paymentMethod_Write')")
    @PostMapping("/create")
    public PaymentMethodModel save(@RequestBody PaymentMethodModel entity)
    {
        return paymentMethodService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere paymentMethod_Read")
    @PreAuthorize("hasAuthority('paymentMethod_Read')")
    @GetMapping("/{id}")
    public PaymentMethodModel read(@PathVariable Integer id)
    {
        return paymentMethodService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere paymentMethod_Write")
    @PreAuthorize("hasAuthority('paymentMethod_Write')")
    @PutMapping("/{id}")
    public PaymentMethodModel update(@RequestBody PaymentMethodModel entity)
    {
        return paymentMethodService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere paymentMethod_Delete")
    @PreAuthorize("hasAuthority('paymentMethod_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        paymentMethodService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los paymentMethods, Requiere paymentMethod_Read")
    @PreAuthorize("hasAuthority('paymentMethod_Read')")
    @GetMapping("/")
    public List<PaymentMethodModel> findAll()
    {
        return paymentMethodService.findAll();
    }
}
