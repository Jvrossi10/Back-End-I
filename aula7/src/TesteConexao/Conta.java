package TesteConexao;

public class Conta {

    private int Id;
    private String nome, numConta;
    private double saldo;

    public Conta(int id, String nome, String numConta, double saldo) {
        Id = id;
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double aumentarSaldo(double valor){
        this.saldo += valor;
        return this.saldo;
    }


}
