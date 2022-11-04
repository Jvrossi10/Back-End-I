package model;

public class Filial {

    private int id, numero;
    private String nomeFilial, rua, cidade, estado;
    private boolean eh5Estrelas;

    public Filial(int id, String nomeFilial, String rua, int numero, String cidade, String estado, boolean eh5Estrelas) {
        this.id = id;
        this.numero = numero;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.eh5Estrelas = eh5Estrelas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isEh5Estrelas() {
        return eh5Estrelas;
    }

    public void setEh5Estrelas(boolean eh5Estrelas) {
        this.eh5Estrelas = eh5Estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", eh5Estrelas=" + eh5Estrelas +
                '}';
    }
}
