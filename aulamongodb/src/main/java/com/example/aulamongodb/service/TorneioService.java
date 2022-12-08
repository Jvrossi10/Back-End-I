package com.example.aulamongodb.service;

import com.example.aulamongodb.model.TorneioModel;
import com.example.aulamongodb.repository.TorneioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneioService {

    private TorneioRepository torneioRepository;

    public TorneioService(TorneioRepository torneioRepository) {
        this.torneioRepository = torneioRepository;
    }

    public TorneioModel guardarTorneio(TorneioModel torneio){
        return torneioRepository.save(torneio);
    }

    public List<TorneioModel> listarTorneios(){
        return torneioRepository.findAll();
    }
}
