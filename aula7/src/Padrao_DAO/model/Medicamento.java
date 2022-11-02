package Padrao_DAO.model;

public class Medicamento {

    private Integer id, qtd;
    private String nome, laboratorio;
    private Double preco;

    public Medicamento(Integer id, String nome, String laboratorio, Integer qtd, Double preco) {
        this.id = id;
        this.qtd = qtd;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.preco = preco;
    }

    public Medicamento(String nome, String laboratorio, Integer qtd, Double preco) {
        this.qtd = qtd;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", qtd=" + qtd +
                ", nome='" + nome + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", preco=" + preco +
                '}';
    }
}
