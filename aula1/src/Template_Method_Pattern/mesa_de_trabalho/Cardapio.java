package Template_Method_Pattern.mesa_de_trabalho;

public abstract class Cardapio {

    public double preco;

    public Cardapio(double preco) {
        this.preco = preco;
    }

    public abstract double Acrescimo();

}
