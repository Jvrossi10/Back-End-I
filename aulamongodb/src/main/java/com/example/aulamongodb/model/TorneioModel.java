package com.example.aulamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "torneios")
public class TorneioModel {

    @Id
    private Integer id;
    private String nome;
    private String pais;
    private String descricaoTorneio;

    public TorneioModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescricaoTorneio() {
        return descricaoTorneio;
    }

    public void setDescricaoTorneio(String descricaoTorneio) {
        this.descricaoTorneio = descricaoTorneio;
    }

    @Override
    public String toString() {
        return "TorneioModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
