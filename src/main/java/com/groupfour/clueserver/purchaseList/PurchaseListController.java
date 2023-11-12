package com.groupfour.clueserver.purchaseList;

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
@RequestMapping("/app/purchaseList")
@CrossOrigin({"*"})
public class PurchaseListController {
        //Consumir el servicio
    @Autowired
    private PurchaseListService purchaseListService;

    //Sub ruta para el create
    @PostMapping("/create")
    public PurchaseListModel save(@RequestBody PurchaseListModel entity)
    {
        return purchaseListService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public PurchaseListModel read(@PathVariable Integer id)
    {
        return purchaseListService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public PurchaseListModel update(@RequestBody PurchaseListModel entity)
    {
        return purchaseListService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        purchaseListService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<PurchaseListModel> findAll()
    {
        return purchaseListService.findAll();
    }
}
