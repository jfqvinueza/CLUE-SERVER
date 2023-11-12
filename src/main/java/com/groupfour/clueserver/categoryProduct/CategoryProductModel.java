package com.groupfour.clueserver.categoryProduct;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CategoryProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer categoryProductId;
    private String nameCategory;
}
