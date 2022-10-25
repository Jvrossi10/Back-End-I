package Facade_Pattern;

public class APIProduto {

    public int desconto(Produto produto){
        if(produto.getTipo().compareTo("Lata") == 0){
            return 10;
        } else {
            return 0;
        }

    }

}
