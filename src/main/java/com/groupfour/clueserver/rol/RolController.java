package com.groupfour.clueserver.rol;

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

@Tag(name = "Controlador rol (rols)", description = "Tabla rols")
@RestController
@RequestMapping("/app/rol")
@CrossOrigin({"*"})
public class RolController {
        //Consumir el servicio
    @Autowired
    private RolService rolService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere rol_Write")    
    @PreAuthorize("hasAuthority('rol_Write')")
    @PostMapping("/create")
    public RolModel save(@RequestBody RolModel entity)
    {
        return rolService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere rol_Read")
    @PreAuthorize("hasAuthority('rol_Read')")
    @GetMapping("/{id}")
    public RolModel read(@PathVariable Integer id)
    {
        return rolService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere rol_Write")
    @PreAuthorize("hasAuthority('rol_Write')")
    @PutMapping("/{id}")
    public RolModel update(@RequestBody RolModel entity)
    {
        return rolService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere rol_Delete")
    @PreAuthorize("hasAuthority('rol_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        rolService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los rols, Requiere rol_Read")
    @PreAuthorize("hasAuthority('rol_Read')")
    @GetMapping("/")
    public List<RolModel> findAll()
    {
        return rolService.findAll();
    }
}
