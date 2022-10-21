package Aula_Integradora_Proxy;

public class Serie implements ISerie{

    private String nome;

    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSerie(String serie) {
        return "www." + this.nome.replaceAll("\\s+","");
    }
}
