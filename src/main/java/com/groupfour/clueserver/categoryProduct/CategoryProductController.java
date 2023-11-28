package com.groupfour.clueserver.categoryProduct;

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

@RestController
@CrossOrigin({ "*" })
@RequestMapping("/app/categoryProduct")
@Tag(name = "Controlador Authority (Permisos)", description = "Tabla authorities")
public class CategoryProductController {
    // Consumir el servicio
    @Autowired
    private CategoryProductService categoryProductService;

    
    // Sub ruta para el read
    @Operation(summary = "Obtiene un permiso por su id, Requiere categoryProduct_Read")
    @PreAuthorize("hasAuthority('categoryProduct_Read')")
    @GetMapping("/{id}")
    public CategoryProductModel read(@PathVariable Integer id) {
        return categoryProductService.findById(id);
    }
    
    // Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los permisos, Requiere categoryProduct_Read")
    @PreAuthorize("hasAuthority('categoryProduct_Read')")
    @GetMapping("/")
    public List<CategoryProductModel> findAll() {
        return categoryProductService.findAll();
    }
    // Sub ruta para el create
    @Operation(summary = "Guarda un permiso (enviado por el body), Requiere categoryProduct_Write")
    //@PreAuthorize("hasAuthority('categoryProduct_Write')")
    @PostMapping("/create")
    public CategoryProductModel save(@RequestBody CategoryProductModel entity) {
        return categoryProductService.save(entity);
    }

    // Sub ruta para el update
    @Operation(summary = "Actualiza un permiso (enviado por el body), Requiere categoryProduct_Write")
    @PreAuthorize("hasAuthority('categoryProduct_Write')")
    @PutMapping("/{id}/")
    public CategoryProductModel update(@RequestBody CategoryProductModel entity) {
        return categoryProductService.save(entity);
    }

    // Sub ruta para el delete
    @Operation(summary = "Borra un permiso (enviado por el body), Requiere categoryProduct_Delete")
    @PreAuthorize("hasAuthority('categoryProduct_Delete')")
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Integer id) {
        categoryProductService.deleteById(id);
    }

}
