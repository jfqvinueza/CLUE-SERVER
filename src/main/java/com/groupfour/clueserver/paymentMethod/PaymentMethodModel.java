package com.groupfour.clueserver.paymentMethod;

import com.groupfour.clueserver.user.UserModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class PaymentMethodModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Boolean transfer;
    private Boolean cash;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;
    
}
