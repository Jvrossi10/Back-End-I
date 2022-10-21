package -Template_Method_Pattern.cozinheiro.src.impl;

import com.dh.pizzaria.service.Cozinheiro;

public class CozinheiroVeggie extends Cozinheiro {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate e brócolis");
    }

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando ingredientes");

    }
}
