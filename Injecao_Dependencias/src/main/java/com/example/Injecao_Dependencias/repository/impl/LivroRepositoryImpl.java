package com.example.Injecao_Dependencias.repository.impl;

import com.example.Injecao_Dependencias.entity.LivroEntity;
import com.example.Injecao_Dependencias.repository.ILivroRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository//estou avisando para o meu spring que essa classe vai funcionar como um
//repositorio e nós não vamos precisar dessa assinatura para a injeção de dependência
public class LivroRepositoryImpl implements ILivroRepository {

    @Override
    public List<LivroEntity> buscarTodosLivros() {
        List<LivroEntity> livroEntityList = new ArrayList<>();
        livroEntityList.add(new LivroEntity(1,"Clean Code","Robert C. Martin"));
        livroEntityList.add(new LivroEntity(2,"Marley e Eu","Arivaldo Camargo"));

        return livroEntityList;
    }
}
