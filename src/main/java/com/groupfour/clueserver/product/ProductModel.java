package com.groupfour.clueserver.product;

import com.groupfour.clueserver.categoryProduct.CategoryProductModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String productName;
    private String description;
    private float price;
    private CategoryProductModel categoryProductId;
    private long stockQuantity;
    private String barcode;

}
