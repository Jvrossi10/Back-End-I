package com.example.aulamongodb.repository;

import com.example.aulamongodb.model.EstadoModel;
import com.example.aulamongodb.model.PartidaModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidaRepository extends MongoRepository<PartidaModel,Integer> {

    List<PartidaModel> findAllByEstado(EstadoModel estado);
}
