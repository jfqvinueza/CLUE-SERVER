package com.groupfour.clueserver.rol;

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
@RequestMapping("/app/rol")
@CrossOrigin({"*"})
public class RolController {
        //Consumir el servicio
    @Autowired
    private RolService rolService;

    //Sub ruta para el create
    @PostMapping("/create")
    public RolModel save(@RequestBody RolModel entity)
    {
        return rolService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public RolModel read(@PathVariable Integer id)
    {
        return rolService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public RolModel update(@RequestBody RolModel entity)
    {
        return rolService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        rolService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<RolModel> findAll()
    {
        return rolService.findAll();
    }
}
