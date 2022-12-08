package com.example.hqlTeste.repository;

import com.example.hqlTeste.model.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JogadorRepository extends JpaRepository<JogadorModel,Long> {

    @Query("Select jogador j from Jogador where j.nome = ?1 ")//esse ?1 vai pegar exatamente
    //o nome que eu vou passar no meu finfJogadorByNome
    Optional<JogadorModel> findJogadorByNome(String nome);
}
