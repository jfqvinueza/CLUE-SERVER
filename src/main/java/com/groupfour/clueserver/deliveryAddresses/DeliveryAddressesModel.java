package com.groupfour.clueserver.deliveryAddresses;

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
public class DeliveryAddressesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer deliveryAddressesId;
    private String deliveryAddress;
    private String descritionReference;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;
}
