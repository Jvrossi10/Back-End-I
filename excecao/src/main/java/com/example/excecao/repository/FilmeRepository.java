package com.example.excecao.repository;

import com.example.excecao.model.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeModel,Integer> {

}
