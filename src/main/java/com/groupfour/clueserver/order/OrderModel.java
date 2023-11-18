package com.groupfour.clueserver.order;

import java.sql.Date;
import java.util.List;

import com.groupfour.clueserver.orderStatus.OrderStatusModel;
import com.groupfour.clueserver.store.StoreModel;
import com.groupfour.clueserver.user.UserModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String orderItems;
    private String deliveryAddress;
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    private long orderTotal;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private StoreModel storeId;
    @OneToMany(mappedBy = "orderId")
    private List<OrderStatusModel> ordersStatus;

}
