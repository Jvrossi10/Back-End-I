package aula_integradora_III.Test;


import aula_integradora_III.model.Quadrado;
import aula_integradora_III.model.Triangulo;
import aula_integradora_III.service.impl.FlyweightFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FlyweightFactoryTest {

    @Test
    void getTrianguloTamanho2(){
        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);
        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        assertEquals(triangulo.getCor(), "vermelho");
        assertEquals(triangulo1.getTamanho(), 4);
        assertEquals(FlyweightFactory.trianguloMap.size() == 1, true);
    }

    @Test
    void getQuadradoTamanho5(){
       // Quadrado quadrado = FlyweightFactory.obterQuadrado(5);
       // quadrado.setCor("Vermelho");                                                          --------------- O PRIMEIRO QUADRADO NÃO VALIDA A COR DE JEITO NENHUM!!!!!
        Quadrado quadrado001 = FlyweightFactory.obterQuadrado(5);
        quadrado001.setCor("Amarelo");
        Quadrado quadrado3 = FlyweightFactory.obterQuadrado(5);
        quadrado3.setCor("Lilás");

        assertEquals(quadrado3.getCor(), "Lilás");
        assertEquals(quadrado001.getTamanho(), 5);
        assertEquals(FlyweightFactory.quadradoMap.size() == 1, true);
    }

    @Test
    void getQuadradocorVerde() {
        Quadrado quadrado = FlyweightFactory.obterQuadrado(5);
        quadrado.setCor("Azul");
        Quadrado quadrado3 = FlyweightFactory.obterQuadrado(5);
        quadrado3.setCor("Verde");

        assertEquals(quadrado.getTamanho(), 5);
        assertEquals(quadrado3.getCor(), "Verde");
        assertEquals(FlyweightFactory.quadradoMap.size()==1, true);

    }

}
