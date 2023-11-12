package com.groupfour.clueserver.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
                                              // Consumir el repository
    @Autowired
    private StoreRepository storeRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<StoreModel> findAll() {
        return storeRepository.findAll();
    }

    // Metodo read
    public StoreModel findById(Integer id) {
        return storeRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public StoreModel save(StoreModel entity) {
        return storeRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        storeRepository.deleteById(id);
    }  
}
