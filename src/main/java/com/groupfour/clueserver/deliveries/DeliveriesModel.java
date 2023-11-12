package com.groupfour.clueserver.deliveries;

import java.sql.Date;

import jakarta.persistence.Column;
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
    private long id;
    private String assignedDeliveryPerson;
   @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDateAndTime;
    private String deliveryLocation;
    private boolean deliveryConfirmation;

}
