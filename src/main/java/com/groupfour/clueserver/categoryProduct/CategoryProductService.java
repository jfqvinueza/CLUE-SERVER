package com.groupfour.clueserver.categoryProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoryProductService {
       //Consumir el repository
    @Autowired
    private CategoryProductRepository categoryProductRepository;
//==================METHODS=====================
       //Metodo para read all data
    public List<CategoryProductModel> findAll()
    {
        return categoryProductRepository.findAll();
    }
        //Metodo read 
    public CategoryProductModel findById(Integer id)
    {
        return categoryProductRepository.findById(id).orElse(null);
    }
    //Metodo para el create
    public CategoryProductModel save(CategoryProductModel entity)
    {
        return categoryProductRepository.save(entity);
    }
    //Metodo update
    //No se define metodo se utiliza en metodo del create
    //Metodo delete
    public void deleteById(Integer id)
    {
        categoryProductRepository.deleteById(id);
    }

 
}
