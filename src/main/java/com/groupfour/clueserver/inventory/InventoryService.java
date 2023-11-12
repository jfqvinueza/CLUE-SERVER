package com.groupfour.clueserver.inventory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
                // Consumir el repository
    @Autowired
    private InventoryRepository inventoryRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<InventoryModel> findAll() {
        return inventoryRepository.findAll();
    }

    // Metodo read
    public InventoryModel findById(Integer id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public InventoryModel save(InventoryModel entity) {
        return inventoryRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        inventoryRepository.deleteById(id);
    }
}
