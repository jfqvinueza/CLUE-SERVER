package com.groupfour.clueserver.categoryProduct;

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
@RequestMapping("/app/categoryProduct")
@CrossOrigin({"*"})
public class CategoryProductController {
            //Consumir el servicio
    @Autowired
    private CategoryProductService categoryProductService;

    //Sub ruta para el create
    @PostMapping("/create")
    public CategoryProductModel save(@RequestBody CategoryProductModel entity)
    {
        return categoryProductService.save(entity);
    }

    //Sub ruta para el read
    @GetMapping("/{id}")
    public CategoryProductModel read(@PathVariable Integer id)
    {
        return categoryProductService.findById(id);
    }

    //Sub ruta para el update
    @PutMapping("/{id}")
    public CategoryProductModel update(@RequestBody CategoryProductModel entity)
    {
        return categoryProductService.save(entity);
    }

    //Sub ruta para el delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        categoryProductService.deleteById(id);
    }

    //Sub ruta para el read all
    @GetMapping("/")
    public List<CategoryProductModel> findAll()
    {
        return categoryProductService.findAll();
    }
}
