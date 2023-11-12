package com.groupfour.clueserver.user;

import com.groupfour.clueserver.rol.RolModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String firstName;
    private String lastName;
    private RolModel roleId;
    private String email;
    private String password;
    private Long numberPhone;
    private byte profilePicture;

}
