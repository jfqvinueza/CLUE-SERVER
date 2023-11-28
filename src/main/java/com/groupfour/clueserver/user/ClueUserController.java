package com.groupfour.clueserver.user;

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

@Tag(name = "Controlador user (users)", description = "Tabla users")
@RestController
@RequestMapping("/app/user")
@CrossOrigin({"*"})
public class ClueUserController {
        //Consumir el servicio
    @Autowired
    private ClueUserService userService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere user_Write")    
    @PreAuthorize("hasAuthority('user_Write')")
    @PostMapping("/create")
    public UserModel save(@RequestBody UserModel entity)
    {
        return userService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere user_Read")
    @PreAuthorize("hasAuthority('user_Read')")
    @GetMapping("/{id}")
    public UserModel read(@PathVariable Integer id)
    {
        return userService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere user_Write")
    @PreAuthorize("hasAuthority('user_Write')")
    @PutMapping("/{id}")
    public UserModel update(@RequestBody UserModel entity)
    {
        return userService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere user_Delete")
    @PreAuthorize("hasAuthority('user_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        userService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los users, Requiere user_Read")
    @PreAuthorize("hasAuthority('user_Read')")
    @GetMapping("/")
    public List<UserModel> findAll()
    {
        return userService.findAll();
    }
}
