package com.groupfour.clueserver.comentAndRating;

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

@Tag(name = "Controlador comentAndRating (comentAndRating)", description = "Tabla comentAndRating")
@RestController
@RequestMapping("/app/comentAndRating")
@CrossOrigin({ "*" })
public class ComentAndRatingController {
    // Consumir el servicio
    @Autowired
    private ComentAndRatingService comentAndRatingService;

    // Sub ruta para el read
    @Operation(summary = "Obtiene un rol por su id, Requiere comentAndRating_Read")
    @PreAuthorize("hasAuthority('comentAndRating_Read')")
    @GetMapping("/{id}")
    public ComentAndRatingModel read(@PathVariable Integer id) {
        return comentAndRatingService.findById(id);
    }

    // Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los comentAndRatings, Requiere comentAndRating_Read")
    @PreAuthorize("hasAuthority('comentAndRating_Read')")
    @GetMapping("/")
    public List<ComentAndRatingModel> findAll() {
        return comentAndRatingService.findAll();
    }

    // Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere comentAndRating_Write")
    @PreAuthorize("hasAuthority('comentAndRating_Write')")
    @PostMapping("/create")
    public ComentAndRatingModel save(@RequestBody ComentAndRatingModel entity) {
        return comentAndRatingService.save(entity);
    }

    // Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere comentAndRating_Write")
    @PreAuthorize("hasAuthority('comentAndRating_Write')")
    @PutMapping("/{id}")
    public ComentAndRatingModel update(@RequestBody ComentAndRatingModel entity) {
        return comentAndRatingService.save(entity);
    }

    // Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere comentAndRating_Delete")
    @PreAuthorize("hasAuthority('comentAndRating_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        comentAndRatingService.deleteById(id);
    }

}
