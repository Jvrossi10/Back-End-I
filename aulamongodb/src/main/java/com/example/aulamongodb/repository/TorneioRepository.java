package com.example.aulamongodb.repository;

import com.example.aulamongodb.model.TorneioModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TorneioRepository extends MongoRepository<TorneioModel,Integer> {
}
