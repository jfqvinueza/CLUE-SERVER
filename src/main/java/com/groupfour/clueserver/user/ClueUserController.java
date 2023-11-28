package com.groupfour.clueserver.user;

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
@RequestMapping("/app/user")
@CrossOrigin({"*"})
public class ClueUserController {
        //Consumir el servicio
    @Autowired
    private ClueUserService userService;

    //Sub ruta para el create
    @PostMapping("/create")
    public UserModel save(@RequestBody UserModel entity)
    {
        return userService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public UserModel read(@PathVariable Integer id)
    {
        return userService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public UserModel update(@RequestBody UserModel entity)
    {
        return userService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        userService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<UserModel> findAll()
    {
        return userService.findAll();
    }
}
