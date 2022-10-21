package Template_Method_Pattern.cozinheiro.src;

public abstract class Cozinheiro {

    public void fazerPizza(){
        prepararMassa();
        preCozinharMassa();
        prepararIngredientes();
        adicionarIngredientes();
        cozinharPizza();
        embalarPizza();
    }

    protected abstract void prepararIngredientes();
    protected abstract void  adicionarIngredientes();

    private void prepararMassa(){
        System.out.println("Preparando a massa...");
    }
    private void preCozinharMassa(){
        System.out.println("Pré-cozinhando a massa...");
    }
    private void cozinharPizza(){
        System.out.println("Enviando a pizza ao forno...");
    }
    private void embalarPizza(){
        System.out.println("Embalando a pizza para entrega.");
    }
}
