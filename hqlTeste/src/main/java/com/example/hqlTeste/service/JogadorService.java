package com.example.hqlTeste.service;

import com.example.hqlTeste.model.JogadorModel;
import com.example.hqlTeste.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JogadorService {

    private JogadorRepository jogadorRepository;

    @Autowired
    public JogadorService(JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }

    public List<JogadorModel> buscarTodos(){
        return jogadorRepository.findAll();
    }

    public JogadorModel buscarPorNome(String nome){
        return jogadorRepository.findJogadorByNome(nome).get();
    }
}
