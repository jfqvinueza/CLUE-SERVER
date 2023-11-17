package com.groupfour.clueserver.rol;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer rolId;
    private boolean storeClerk;
    private boolean customer;
    private boolean delivery;


}
