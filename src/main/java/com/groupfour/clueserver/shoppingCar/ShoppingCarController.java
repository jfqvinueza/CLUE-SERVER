package com.groupfour.clueserver.shoppingCar;

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
@RequestMapping("/app/shoppingCar")
@CrossOrigin({"*"})
public class ShoppingCarController {
        //Consumir el servicio
    @Autowired
    private ShoppingCarService shoppingCarService;

    //Sub ruta para el create
    @PostMapping("/create")
    public ShoppingCarModel save(@RequestBody ShoppingCarModel entity)
    {
        return shoppingCarService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public ShoppingCarModel read(@PathVariable Integer id)
    {
        return shoppingCarService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public ShoppingCarModel update(@RequestBody ShoppingCarModel entity)
    {
        return shoppingCarService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        shoppingCarService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<ShoppingCarModel> findAll()
    {
        return shoppingCarService.findAll();
    }
}
