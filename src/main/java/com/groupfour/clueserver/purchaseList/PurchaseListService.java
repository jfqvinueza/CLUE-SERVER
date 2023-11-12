package com.groupfour.clueserver.purchaseList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseListService {
                                    // Consumir el repository
    @Autowired
    private PurchaseListRepository purchaseListRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<PurchaseListModel> findAll() {
        return purchaseListRepository.findAll();
    }

    // Metodo read
    public PurchaseListModel findById(Integer id) {
        return purchaseListRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public PurchaseListModel save(PurchaseListModel entity) {
        return purchaseListRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        purchaseListRepository.deleteById(id);
    }
}
