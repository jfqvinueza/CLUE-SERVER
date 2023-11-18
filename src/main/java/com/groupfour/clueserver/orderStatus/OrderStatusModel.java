package com.groupfour.clueserver.orderStatus;

// import com.groupfour.clueserver.customer.CustomerModel;
import com.groupfour.clueserver.order.OrderModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class OrderStatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nameStatus;
    private String description;
    // private CustomerModel customerId;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderModel orderId;
}
