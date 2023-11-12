package com.groupfour.clueserver.deliveryPerson;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DeliveryPersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String deliveryPersonName;
    private long deliveryPersonIDNumber;
    private String deliveryHistory;


}
