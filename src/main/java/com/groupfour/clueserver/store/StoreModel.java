package com.groupfour.clueserver.store;

import java.util.List;

import com.groupfour.clueserver.order.OrderModel;
import com.groupfour.clueserver.product.ProductModel;
import com.groupfour.clueserver.user.UserModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class StoreModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeId;
    private String storeName;
    private String storeAddress;
    private String openTimeStore;
    private String closeTimeStore;
    private String storeContactInformation;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;
    @OneToMany(mappedBy = "storeId")
    private List<ProductModel> products;
    @OneToMany(mappedBy = "storeId")
    private List<OrderModel> orders;

    // =============METHODS==============
    // =============GET===============
    public Integer getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreAddress() {
        return this.storeAddress;
    }

    public String getOpenTimeStore() {
        return this.openTimeStore;
    }

    public String getCloseTimeStore() {
        return this.closeTimeStore;
    }


    public String getStoreContactInformation() {
        return this.storeContactInformation;
    }

    // =============SET===============
    public void setStoreId(Integer newStoreId) {
        this.storeId = newStoreId;
    }

    public void setStoreName(String newStoreName) {
        this.storeName = newStoreName;
    }

    public void setStoreAddress(String newStoreAddress) {
        this.storeAddress = newStoreAddress;
    }

    public void setOpenTimeStore(String newOpenTimeStore) {
        this.openTimeStore = newOpenTimeStore;
    }

    public void setCloseTimeStore(String newCloseTimeStore) {
        this.closeTimeStore = newCloseTimeStore;
    }

    public void setStoreContactInformation(String newStoreContactInformation) {
        this.storeContactInformation = newStoreContactInformation;
    }
}
