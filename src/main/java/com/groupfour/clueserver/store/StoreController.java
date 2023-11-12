package com.groupfour.clueserver.store;

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
@RequestMapping("/app/store")
@CrossOrigin({"*"})
public class StoreController {
      //Consumir el servicio
    @Autowired
    private StoreService storeService;

    //Sub ruta para el create
    @PostMapping("/create")
    public StoreModel save(@RequestBody StoreModel entity)
    {
        return storeService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public StoreModel read(@PathVariable Integer id)
    {
        return storeService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public StoreModel update(@RequestBody StoreModel entity)
    {
        return storeService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        storeService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<StoreModel> findAll()
    {
        return storeService.findAll();
    }  
}
