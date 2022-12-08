package com.example.hqlTeste.repository;

import com.example.hqlTeste.model.TreinadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TreinadorRepository extends JpaRepository<TreinadorModel,Long> {

    @Query("Select treinador t from Treinador where t.idade = ?1")
    Optional<TreinadorModel> findTreinadorByIdade(Integer idade);
}
