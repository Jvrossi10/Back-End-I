package com.example.professorAluno.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Professor")//definir o nome da tabela
public class ProfessorModel {

    @Id
    @SequenceGenerator(name = "professor_sequence",sequenceName = "professor_sequence",allocationSize = 1)
    //vai criar e controlar a criação do ids
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "professor_sequence")
    private Long id;
    private String nome;
    private String titulo;

    @OneToMany(mappedBy = "professorModel",fetch = FetchType.LAZY)//o fetch indica que quando nós
    //formos trazer o professor, não trazer os alunos junto porque teria um trafego de dados muito grande
    private Set<AlunoModel> alunoModels = new HashSet<>();

    public ProfessorModel() {
    }

    public ProfessorModel(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
