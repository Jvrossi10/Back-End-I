package com.example.hqlTeste.service;

import com.example.hqlTeste.model.TreinadorModel;
import com.example.hqlTeste.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TreinadorService {

    private TreinadorRepository treinadorRepository;

    @Autowired
    public TreinadorService (TreinadorRepository treinadorRepository){
        this.treinadorRepository = treinadorRepository;
    }

    public List<TreinadorModel> buscarTodos(){
        return treinadorRepository.findAll();
    }

    public TreinadorModel buscarPorIdade(Integer idade){
        return treinadorRepository.findTreinadorByIdade(idade).get();
    }
}
