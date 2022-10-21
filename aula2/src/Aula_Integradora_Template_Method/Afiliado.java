package Aula_Integradora_Template_Method;

public class Afiliado extends Vendedor{

    private int pontos;

    public Afiliado(String categoria, int pontos) {
        super(categoria);
        this.pontos = pontos;
    }

    @Override
    public void vender() {
        this.pontos += 15;
    }

    @Override
    public int calcularPontos() {
        return this.pontos;
    }

    @Override
    public void recategorizar(Vendedor vendedor){
        if (this.pontos < 20){
            vendedor.setCategoria("Novato");
        } else if((this.pontos >= 20) && (this.pontos <= 30)){
            vendedor.setCategoria("Aprendiz");
        } else if((this.pontos >= 31) && (this.pontos <= 40)){
            vendedor.setCategoria("bom");
        } else {
            vendedor.setCategoria("mestre");
        }
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categoria alcançada pelo funcinário: " + getCategoria());
    }

    @Override
    public String toString() {
        return "Afiliado{" +
                "pontos=" + pontos +
                '}';
    }
}
