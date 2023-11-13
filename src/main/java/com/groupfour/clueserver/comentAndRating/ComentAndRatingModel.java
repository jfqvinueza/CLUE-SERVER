package com.groupfour.clueserver.comentAndRating;

import java.sql.Date;

import org.hibernate.annotations.ManyToAny;

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
public class ComentAndRatingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer comentAndRatingId;
    private String commentText;
    private long rating;
    private long customerID;
    private long productID;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePosted;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userModelId;

}
