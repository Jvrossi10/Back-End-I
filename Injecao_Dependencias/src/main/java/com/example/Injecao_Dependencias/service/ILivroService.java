package com.example.Injecao_Dependencias.service;

import java.util.List;

public interface ILivroService<T> {

    public List<T> buscarTodosLivros();
}
