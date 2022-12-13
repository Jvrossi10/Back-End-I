package com.example.testeIntegrador.model;

public class LinguagemModel {

    public String tipo;
    public Boolean seOrientadaAoObjeto;

    public LinguagemModel(String tipo, Boolean seOrientadaAoObjeto) {
        this.tipo = tipo;
        this.seOrientadaAoObjeto = seOrientadaAoObjeto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getSeOrientadaAoObjeto() {
        return seOrientadaAoObjeto;
    }

    public void setSeOrientadaAoObjeto(Boolean seOrientadaAoObjeto) {
        this.seOrientadaAoObjeto = seOrientadaAoObjeto;
    }
}
