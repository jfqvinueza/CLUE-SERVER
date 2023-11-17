package com.groupfour.clueserver.deliveries;

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
public class DeliveriesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long DeliveriesId;
    private String assignedDeliveryPerson;
    @Temporal(TemporalType.DATE)
    private Date deliveryDateAndTime;
    private String deliveryLocation;
    private boolean deliveryConfirmation;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;

}
