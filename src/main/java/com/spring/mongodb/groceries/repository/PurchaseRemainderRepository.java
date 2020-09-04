package com.spring.mongodb.groceries.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.mongodb.groceries.collection.PurchaseRemainder;

/**
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Fri 04-Sep-2020 21:31
 */
@RepositoryRestResource(collectionResourceRel = "purchaseRemainder", path = "purchaseRemainder")
public interface PurchaseRemainderRepository extends MongoRepository<PurchaseRemainder, String> {

}
