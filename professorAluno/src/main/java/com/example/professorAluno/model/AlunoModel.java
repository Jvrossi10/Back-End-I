package com.example.professorAluno.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Aluno")
public class AlunoModel {

    @Id
    @SequenceGenerator(name = "aluno_sequence",sequenceName = "aluno_sequence",allocationSize = 1)
    //vai criar e controlar a criação do ids
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "aluno_sequence")
    private Long id;
    private String nome;
    private int idade;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)//quando eu remover o professor,
    //todos os alunos que estiverem associados a ele também serão removidos
    @JoinColumn(name = "professor_id")//onde ele faz o join com a tabela professor
    private ProfessorModel professorModel; // ele vai fazer o join com o ProfessorModel

    public AlunoModel() {
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
