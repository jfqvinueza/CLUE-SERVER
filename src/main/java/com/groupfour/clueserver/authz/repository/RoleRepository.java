package com.groupfour.clueserver.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.groupfour.clueserver.authz.entity.Role;




public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
