package com.groupfour.clueserver.user;

import java.util.List;

import com.groupfour.clueserver.comentAndRating.ComentAndRatingModel;
import com.groupfour.clueserver.deliveryAddresses.DeliveryAddressesModel;
import com.groupfour.clueserver.order.OrderModel;
import com.groupfour.clueserver.paymentMethod.PaymentMethodModel;
import com.groupfour.clueserver.rol.RolModel;
import com.groupfour.clueserver.store.StoreModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String numberPhone;
    private byte profilePicture;
    @OneToMany(mappedBy = "userModelId")
    private List<ComentAndRatingModel> comentsAndRatings;
    @OneToMany(mappedBy = "userId")
    private List<DeliveryAddressesModel> deliveryAdresses;
    @OneToMany(mappedBy = "userId")
    private List<PaymentMethodModel> paymentMethods;
    @OneToMany(mappedBy = "userId")
    private List<StoreModel> stores;
    @OneToMany(mappedBy = "userId")
    private List<OrderModel> orders;


        // =============METHODS==============
    // =============GET===============
    public Integer getUserId() {
        return this.userId;
    }
    public String getUserFirstName() {
        return this.firstName;
    }
    public String getUserLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    public String getNumberPhone() {
        return this.numberPhone;
    }
    public byte getProfilePicture() {
        return this.profilePicture;
    }
    // =========SET=======================
    public void setUserId(Integer newId) {
        this.userId=newId;
    }
    public void setUserFirstName(String newfirstName) {
        this.firstName=newfirstName;
    }
    public void setUserLastName(String newLastName) {
        this.lastName=newLastName;
    }

    public void setEmail(String newEmail) {
        this.email=newEmail;
    }
    public void setPassword(String newPassword) {
        this.password=newPassword;
    }
    public void setNumberPhone(String newNumberPhone) {
        this.numberPhone=newNumberPhone;
    }
    public void setProfilePicture(byte newProfilePicture) {
        this.profilePicture=newProfilePicture;
    }
    //====================================
    
}
