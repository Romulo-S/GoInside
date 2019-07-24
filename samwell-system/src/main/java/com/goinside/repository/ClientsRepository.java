package com.goinside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.goinside.pojo.Clients;

@Repository
public interface ClientsRepository extends MongoRepository<Clients, String> {

}
