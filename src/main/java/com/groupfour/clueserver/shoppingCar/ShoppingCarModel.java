package com.groupfour.clueserver.shoppingCar;

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
public class ShoppingCarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer soppingCarId;
    @OneToMany(mappedBy = "shoppingCarId")
    private List<ProductModel> productId;
    private float totalAmount;
}
