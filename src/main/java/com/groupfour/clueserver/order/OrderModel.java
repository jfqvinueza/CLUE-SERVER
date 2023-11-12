package com.groupfour.clueserver.order;

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
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String orderItems;
    private String deliveryAddress;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    private String orderStatus;
    private long orderTotal;
}
