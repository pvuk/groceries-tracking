/**
 * 
 */
package com.spring.mongodb.groceries.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.mongodb.groceries.collection.GroceriesTracking;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 02-Sep-2020 22:16
 */
@RepositoryRestResource(collectionResourceRel = "groceriesTracking", path = "groceriesTracking")
public interface GroceriesTrackingRepository extends MongoRepository<GroceriesTracking, String> {

}
