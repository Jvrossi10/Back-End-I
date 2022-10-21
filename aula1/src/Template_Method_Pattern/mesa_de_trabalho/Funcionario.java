package Template_Method_Pattern.mesa_de_trabalho;

public class Funcionario {

    private String nome;
    private int id;
    private double valorTotal;


    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void montar(Cardapio cardapio) {
        valorTotal += cardapio.preco;
    }

    public double calcularPreco(){
        return valorTotal;
    }



}
