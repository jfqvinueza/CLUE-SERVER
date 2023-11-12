package com.groupfour.clueserver.comentAndRating;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/app/comentAndRating")
@CrossOrigin({"*"})
public class ComentAndRatingController {
            //Consumir el servicio
    @Autowired
    private ComentAndRatingService comentAndRatingService;

    //Sub ruta para el create
    @PostMapping("/create")
    public ComentAndRatingModel save(@RequestBody ComentAndRatingModel entity)
    {
        return comentAndRatingService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public ComentAndRatingModel read(@PathVariable Integer id)
    {
        return comentAndRatingService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public ComentAndRatingModel update(@RequestBody ComentAndRatingModel entity)
    {
        return comentAndRatingService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        comentAndRatingService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<ComentAndRatingModel> findAll()
    {
        return comentAndRatingService.findAll();
    }
}
