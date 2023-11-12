package com.groupfour.clueserver.product;

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
@RequestMapping("/app/product")
@CrossOrigin({"*"})
public class ProductController {
        //Consumir el servicio
    @Autowired
    private ProductService productService;

    //Sub ruta para el create
    @PostMapping("/create")
    public ProductModel save(@RequestBody ProductModel entity)
    {
        return productService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public ProductModel read(@PathVariable Integer id)
    {
        return productService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public ProductModel update(@RequestBody ProductModel entity)
    {
        return productService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        productService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<ProductModel> findAll()
    {
        return productService.findAll();
    }
}
