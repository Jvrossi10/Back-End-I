package Template_Method_Pattern.mesa_de_trabalho;

public class Cardapio_Adulto extends Cardapio{

    private double precoAdulto;

    public Cardapio_Adulto(double preco) {
        super(preco);
        this.precoAdulto = preco;
    }

    public double getPrecoAdulto() {
        return precoAdulto;
    }

    public void setPrecoAdulto(double precoAdulto) {
        this.precoAdulto = precoAdulto;
    }

    @Override
    public double Acrescimo() {
        return precoAdulto;
    }
}
