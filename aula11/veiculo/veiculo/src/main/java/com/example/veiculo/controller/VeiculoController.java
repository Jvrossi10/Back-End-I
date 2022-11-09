package com.example.veiculo.controller;

import com.example.veiculo.model.Veiculo;
import com.example.veiculo.service.IVeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculo")

public class VeiculoController {

    private final IVeiculoService vs;


    @Autowired
    public VeiculoController(IVeiculoService vs){
        this.vs = vs;
    }

    @GetMapping

    public List<Veiculo> getVeicuo(){
        return vs.listVeiculo();
    }
}
