package com.groupfour.clueserver.shoppingCar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCarService {
                                           // Consumir el repository
    @Autowired
    private ShoppingCarRepository shoppingCarRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<ShoppingCarModel> findAll() {
        return shoppingCarRepository.findAll();
    }

    // Metodo read
    public ShoppingCarModel findById(Integer id) {
        return shoppingCarRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public ShoppingCarModel save(ShoppingCarModel entity) {
        return shoppingCarRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        shoppingCarRepository.deleteById(id);
    } 
}
