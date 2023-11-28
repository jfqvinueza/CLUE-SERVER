package com.groupfour.clueserver.product;

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

@Tag(name = "Controlador product (products)", description = "Tabla products")
@RestController
@RequestMapping("/app/product")
@CrossOrigin({"*"})
public class ProductController {
        //Consumir el servicio
    @Autowired
    private ProductService productService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere product_Write")    
    @PreAuthorize("hasAuthority('product_Write')")
    @PostMapping("/create")
    public ProductModel save(@RequestBody ProductModel entity)
    {
        return productService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere product_Read")
    @PreAuthorize("hasAuthority('product_Read')")
    @GetMapping("/{id}")
    public ProductModel read(@PathVariable Integer id)
    {
        return productService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere product_Write")
    @PreAuthorize("hasAuthority('product_Write')")
    @PutMapping("/{id}")
    public ProductModel update(@RequestBody ProductModel entity)
    {
        return productService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere product_Delete")
    @PreAuthorize("hasAuthority('product_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        productService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los products, Requiere product_Read")
    @PreAuthorize("hasAuthority('product_Read')")
    @GetMapping("/")
    public List<ProductModel> findAll()
    {
        return productService.findAll();
    }
}
