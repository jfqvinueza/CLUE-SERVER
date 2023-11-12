package com.groupfour.clueserver.shoppingCar;

import com.groupfour.clueserver.product.ProductModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ShoppingCarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private ProductModel productId;
    private float totalAmount;
}
