package com.example.excecao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Filmes")
public class FilmeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String titulo;
    private String categoria;
    private Integer premios;

    public FilmeModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getPremios() {
        return premios;
    }

    public void setPremios(Integer premios) {
        this.premios = premios;
    }
}
