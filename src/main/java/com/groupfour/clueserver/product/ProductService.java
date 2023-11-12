package com.groupfour.clueserver.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
                                // Consumir el repository
    @Autowired
    private ProductRepository productRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }

    // Metodo read
    public ProductModel findById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public ProductModel save(ProductModel entity) {
        return productRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
