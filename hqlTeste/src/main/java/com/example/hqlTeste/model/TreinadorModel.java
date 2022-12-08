package com.example.hqlTeste.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Treinador")
public class TreinadorModel {

    @Id
    @SequenceGenerator(name = "treinador_sequence",sequenceName = "treinador_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_generator")
    private Long id;
    private String nome;
    private int idade;

    @OneToMany(mappedBy = "treinadorModel",fetch = FetchType.LAZY)
    private Set<JogadorModel> jogadores = new HashSet<JogadorModel>();

    public TreinadorModel() {
    }

    public TreinadorModel(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
