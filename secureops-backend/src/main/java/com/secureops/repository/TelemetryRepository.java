package com.secureops.repository;

import com.secureops.model.TelemetryFeed;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TelemetryRepository extends MongoRepository<TelemetryFeed, String> {

}