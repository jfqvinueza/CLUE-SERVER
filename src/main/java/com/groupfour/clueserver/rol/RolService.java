package com.groupfour.clueserver.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
                                       // Consumir el repository
    @Autowired
    private RolRepository rolRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<RolModel> findAll() {
        return rolRepository.findAll();
    }

    // Metodo read
    public RolModel findById(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public RolModel save(RolModel entity) {
        return rolRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        rolRepository.deleteById(id);
    } 
}
