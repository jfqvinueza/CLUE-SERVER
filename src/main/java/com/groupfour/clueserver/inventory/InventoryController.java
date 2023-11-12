package com.groupfour.clueserver.inventory;

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
@RequestMapping("/app/inventory")
@CrossOrigin({"*"})
public class InventoryController {
        //Consumir el servicio
    @Autowired
    private InventoryService InventoryModelService;

    //Sub ruta para el create
    @PostMapping("/create")
    public InventoryModel save(@RequestBody InventoryModel entity)
    {
        return InventoryModelService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public InventoryModel read(@PathVariable Integer id)
    {
        return InventoryModelService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public InventoryModel update(@RequestBody InventoryModel entity)
    {
        return InventoryModelService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        InventoryModelService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<InventoryModel> findAll()
    {
        return InventoryModelService.findAll();
    }
}
