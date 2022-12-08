package com.example.Injecao_Dependencias.repository;

import java.util.List;

public interface ILivroRepository<T> {

    public List<T> buscarTodosLivros();
}
