package com.groupfour.clueserver.purchaseList;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PurchaseListRepository extends CrudRepository<PurchaseListModel, Integer> {
    List<PurchaseListModel> findAll();
}
