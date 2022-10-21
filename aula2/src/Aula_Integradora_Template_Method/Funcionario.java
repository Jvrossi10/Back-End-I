package Aula_Integradora_Template_Method;

public class Funcionario extends Vendedor{

    private int pontos;
    private int anos;

    public Funcionario(String categoria, int pontos, int anos) {
        super(categoria);
        this.pontos = pontos;
        this.anos = anos;
    }

    public void obterAfiliado(){
        this.pontos += 10;
    }

    @Override
    public void vender(){
        this.pontos += 5 ;
    }

    @Override
    public int calcularPontos() {
        return  this.pontos + (this.anos * 5);
    }

    @Override
    public void recategorizar(Vendedor vendedor){
        if (this.pontos < 20){
             vendedor.setCategoria("Novato");
        } else if((this.pontos + this.anos >= 20) && (this.pontos + this.anos <= 30)){
            vendedor.setCategoria("Aprendiz");
        } else if((this.pontos + this.anos >= 31) && (this.pontos + this.anos <= 40)){
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
        return "Funcionario{" +
                "pontos=" + pontos +
                ", anos=" + anos +
                '}';
    }

}
