package com.groupfour.clueserver.categoryProduct;

import java.util.List;

import com.groupfour.clueserver.product.ProductModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class CategoryProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer categoryProductId;
    private String nameCategory;
    @OneToMany(mappedBy = "categoryProductId")
    private List<ProductModel> productModelId;

}
