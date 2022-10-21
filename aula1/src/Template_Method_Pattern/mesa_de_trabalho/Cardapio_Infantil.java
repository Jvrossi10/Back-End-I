package Template_Method_Pattern.mesa_de_trabalho;

public class Cardapio_Infantil extends Cardapio{

    private double precoInfantil, brinquedo;

    public Cardapio_Infantil(double preco, double brinquedo) {
        super(preco);
        this.precoInfantil = preco;
        this.brinquedo = brinquedo;
    }

    public double getPrecoInfantil() {
        return precoInfantil;
    }

    public void setPrecoInfantil(double precoInfantil) {
        this.precoInfantil = precoInfantil;
    }

    public double getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(double brinquedo) {
        this.brinquedo = brinquedo;
    }

    @Override
    public double Acrescimo() {
        return precoInfantil + brinquedo;
    }
}
