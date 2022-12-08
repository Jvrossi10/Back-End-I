package com.example.Injecao_Dependencias.service.impl;

import com.example.Injecao_Dependencias.dto.LivroDto;
import com.example.Injecao_Dependencias.entity.LivroEntity;
import com.example.Injecao_Dependencias.repository.ILivroRepository;
import com.example.Injecao_Dependencias.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroServiceImpl implements ILivroService {

    @Autowired //ele faz com que a injeção de dependência funcione
    // quando utilizamos o Autowired ele faz os instanciamentos sozinho
    //e o próprio spring vai tratar desses instanciamentos
    //deixa o código mais enxuto e muito mais limpo
    private ILivroRepository livroRepository;

    @Override
    public List<LivroDto> buscarTodosLivros() {

        List<LivroDto> response;
        List<LivroEntity> livroEntityList = this.livroRepository.buscarTodosLivros();

        response = livroEntityList.stream().map(LivroDto::new).collect(Collectors.toList());
        //usamos essa fórmula para preencher a nossa lista que é o stream(recurso do java)
        //que vai percorrer uma lista e vamos fazer o mapeamento para cada um dos itens
        //da nossa lista
        //vamos criar um novo DTO e depois ele joga essa coleção para uma lista
        //essa lista do DTO vai ser mandada para o controller
        return response;
    }
}
