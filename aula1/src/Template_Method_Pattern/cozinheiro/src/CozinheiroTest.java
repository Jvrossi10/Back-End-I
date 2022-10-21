package Template_Method_Pattern.cozinheiro.src;

import com.dh.pizzaria.service.impl.CozinheiroNoVeggie;
import com.dh.pizzaria.service.impl.CozinheiroVeggie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CozinheiroTest {

    @Test
    void fazerPizzas() {
        Cozinheiro cozinheiroVeggie = new CozinheiroVeggie();
        Cozinheiro cozinheiroNoVeggie = new CozinheiroNoVeggie();

        System.out.println("PIZZA VEGANA:");
        cozinheiroVeggie.fazerPizza();
        System.out.println("PIZZA TRADICIONAL:");
        cozinheiroNoVeggie.fazerPizza();
    }
}