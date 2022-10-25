package Facade_Pattern;

public class Main {

    public static void main(String[] args) {

        FacadeDesconto facade = new FacadeDesconto();
        Cartao cartao = new Cartao("3344556677889900", "Star Bank");
        Produto produto = new Produto("Ervilhas", "Lata");

        System.out.println("Desconto: " + facade.desconto(cartao, produto, 1));
    }

}
