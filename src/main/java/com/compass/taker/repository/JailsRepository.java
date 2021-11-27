package com.compass.taker.repository;

import com.compass.taker.model.Jails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JailsRepository  extends MongoRepository<Jails, String> {


}
