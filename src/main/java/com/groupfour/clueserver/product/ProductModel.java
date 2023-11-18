package com.groupfour.clueserver.product;

import com.groupfour.clueserver.categoryProduct.CategoryProductModel;
import com.groupfour.clueserver.shoppingCar.ShoppingCarModel;
import com.groupfour.clueserver.store.StoreModel;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String productName;
    private String description;
    private float price;
    private long stockQuantity;
    private String barcode;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private StoreModel storeId;
    @ManyToOne
    @JoinColumn(name = "categoryProduct_id")
    private CategoryProductModel categoryProductId;
    @ManyToOne
    @JoinColumn(name = "shoppingCard_id")
    private ShoppingCarModel shoppingCarId;

}
