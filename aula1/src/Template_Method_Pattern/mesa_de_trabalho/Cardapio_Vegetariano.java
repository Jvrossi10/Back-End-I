package Template_Method_Pattern.mesa_de_trabalho;

public class Cardapio_Vegetariano extends Cardapio{

    private double precoVeg;

    public Cardapio_Vegetariano(double preco) {
        super(preco);
        this.precoVeg = preco;
    }

    public double getPrecoVeg() {
        return precoVeg;
    }

    public void setPrecoVeg(double precoVeg) {
        this.precoVeg = precoVeg;
    }

    @Override
    public double Acrescimo() {
        return precoVeg + (precoVeg*0.01);
    }
}
