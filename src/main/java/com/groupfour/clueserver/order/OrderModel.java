package com.groupfour.clueserver.order;

import java.sql.Date;

import com.groupfour.clueserver.user.UserModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String orderItems;
    private String deliveryAddress;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    private String orderStatus;
    private long orderTotal;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;
}
