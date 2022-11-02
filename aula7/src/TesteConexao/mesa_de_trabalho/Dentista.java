package TesteConexao.mesa_de_trabalho;

public class Dentista {

    private String sobrenome, nome;
    private int matricula, id;

    public Dentista(int id, String sobrenome, String nome, int matricula) {
        this.id = id;
        this.sobrenome = sobrenome;
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int mudarMatricula(int novaMatricula){
        this.matricula = novaMatricula;
        return this.matricula;
    }
}
