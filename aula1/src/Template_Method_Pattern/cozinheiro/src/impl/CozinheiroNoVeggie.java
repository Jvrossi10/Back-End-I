package Template_Method_Pattern.cozinheiro.src.impl;

import com.dh.pizzaria.service.Cozinheiro;

public class CozinheiroNoVeggie extends Cozinheiro {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando fatias de carne, queijo e presunto...");
    }

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando os ingredientes");
    }
}
