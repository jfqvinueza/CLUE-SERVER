package com.groupfour.clueserver.rol;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<RolModel,Integer>{
    List<RolModel>findAll();
}
