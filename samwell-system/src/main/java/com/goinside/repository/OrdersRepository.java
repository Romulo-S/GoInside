package com.goinside.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.goinside.pojo.Orders;

@Repository
public interface OrdersRepository extends MongoRepository<Orders, String> {

	Orders findBy_id(ObjectId _id);
}
