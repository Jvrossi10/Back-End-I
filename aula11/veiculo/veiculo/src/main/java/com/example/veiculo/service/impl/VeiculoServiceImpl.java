package com.example.veiculo.service.impl;

import com.example.veiculo.model.Veiculo;
import com.example.veiculo.service.IVeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service

public class VeiculoServiceImpl implements IVeiculoService {

    @Override
    public List<Veiculo> listVeiculo() {
        return Arrays.asList(new Veiculo("audi", "branco"), new Veiculo("BMW", "preto"), new Veiculo("ford", "azul"));
    }

}
