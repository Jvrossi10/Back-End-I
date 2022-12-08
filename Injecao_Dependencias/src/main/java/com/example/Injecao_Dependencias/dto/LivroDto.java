package com.example.Injecao_Dependencias.dto;

import com.example.Injecao_Dependencias.entity.LivroEntity;

public class LivroDto {

    private String titulo;
    private String autor;

    public LivroDto(LivroEntity livroEntity) {
        this.titulo = livroEntity.getTitulo();
        this.autor = livroEntity.getAutor();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
