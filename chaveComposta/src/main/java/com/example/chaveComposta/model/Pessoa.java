package com.example.chaveComposta.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Pessoa")
@IdClass(value = PessoaKey.class)//está indicando que o id é uma classe
public class Pessoa {
    @Id
    private Integer cpf;
    @Id
    private Integer identidade;

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Integer identidade) {
        this.identidade = identidade;
    }
}
