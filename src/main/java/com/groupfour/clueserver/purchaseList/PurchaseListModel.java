package com.groupfour.clueserver.purchaseList;

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
public class PurchaseListModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseDate;
    private long orderNumber;
    private float totalAmount;
    private String orderStatus;
    private String associatedStore;
    private String deliveryInfo;
    private String paymentMethod;
    private String ratingsAndComments;
    private Long invoiceNumber;

}
