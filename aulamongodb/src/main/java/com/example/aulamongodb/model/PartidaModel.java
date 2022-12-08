package com.example.aulamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "partidas")
public class PartidaModel {

    @Id
    private Integer id;
    private String resultado;
    private EstadoModel estado;
    @Field(name = "equipe_local")
    private EquipeModel equipeLocal;
    @Field(name = "equipe_visitante")
    private EquipeModel equipeVisitante;

    public PartidaModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public EstadoModel getEstado() {
        return estado;
    }

    public void setEstado(EstadoModel estado) {
        this.estado = estado;
    }

    public EquipeModel getEquipeLocal() {
        return equipeLocal;
    }

    public void setEquipeLocal(EquipeModel equipeLocal) {
        this.equipeLocal = equipeLocal;
    }

    public EquipeModel getEquipeVisitante() {
        return equipeVisitante;
    }

    public void setEquipeVisitante(EquipeModel equipeVisitante) {
        this.equipeVisitante = equipeVisitante;
    }

    @Override
    public String toString() {
        return "PartidaModel{" +
                "id=" + id +
                ", resultado='" + resultado + '\'' +
                ", estado=" + estado +
                ", equuipeLocal=" + equipeLocal +
                ", equipeVisitante=" + equipeVisitante +
                '}';
    }
}
