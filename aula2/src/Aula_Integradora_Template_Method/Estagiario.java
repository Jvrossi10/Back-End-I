package Aula_Integradora_Template_Method;

public class Estagiario extends Vendedor{

    private int pontos;

    public Estagiario(String categoria, int pontos) {
        super(categoria);
        this.pontos = pontos;
    }

    @Override
    public void vender() {
        this.pontos += 5 ;
    }

    @Override
    public int calcularPontos() {
        return this.pontos;
    }

    @Override
    public void recategorizar(Vendedor vendedor) {
        if(this.pontos < 50){
            setCategoria("Estagiário novato");
        } else {
            setCategoria("Estagiário experiente");
        }
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categoria alcançada pelo funcinário: " + getCategoria());
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "pontos=" + pontos +
                '}';
    }

}
