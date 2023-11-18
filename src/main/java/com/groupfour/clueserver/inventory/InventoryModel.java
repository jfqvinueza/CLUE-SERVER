package com.groupfour.clueserver.inventory;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class InventoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer inventoryId;
    @Temporal(TemporalType.DATE)
    private Date inventoryDate;
    private Long storeID;
    private String inventoryDescription;
    private Long totalStockQuantity;
    private String inventoryItems;

}
