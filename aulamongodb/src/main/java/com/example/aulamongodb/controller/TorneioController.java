package com.example.aulamongodb.controller;

import com.example.aulamongodb.model.TorneioModel;
import com.example.aulamongodb.service.TorneioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneios")
public class TorneioController {

    private TorneioService torneioService;

    public TorneioController(TorneioService torneioService) {
        this.torneioService = torneioService;
    }

    @PostMapping
    public TorneioModel adicionarTorneio(@RequestBody TorneioModel torneio){
        return torneioService.guardarTorneio(torneio);
    }

    @GetMapping
    public List<TorneioModel> listarTorneios(){
        return torneioService.listarTorneios();
    }
}
