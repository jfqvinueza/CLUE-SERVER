package com.groupfour.clueserver.comentAndRating;

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
public class ComentAndRatingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String commentText;
    private long rating;
    private long customerID;
    private long productID;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePosted;

}
