package com.groupfour.clueserver.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
                                                  // Consumir el repository
    @Autowired
    private UserRepository userRepository;

    // ==================METHODS=====================
    // Metodo para read all data
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    // Metodo read
    public UserModel findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    // Metodo para el create
    public UserModel save(UserModel entity) {
        return userRepository.save(entity);
    }

    // Metodo update
    // No se define metodo se utiliza en metodo del create
    // Metodo delete
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }  
}