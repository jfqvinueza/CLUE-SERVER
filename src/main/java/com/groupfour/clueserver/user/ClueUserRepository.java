package com.groupfour.clueserver.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClueUserRepository extends CrudRepository<UserModel, Integer> {
    List<UserModel> findAll();
}
