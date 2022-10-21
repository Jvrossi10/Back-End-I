package JUnit.mesa_de_trabalho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiguraTest {

    Circulo c1, c2;
    Quadrado q1, q2;

    @BeforeEach
    void doBefore(){
        c1 = new Circulo(2.0);
        c2 = new Circulo(3.15);
        q1 = new Quadrado(4.0);
        q2 = new Quadrado(5.0);
    }

    @Test
    void calcularPerimetroCirculo() {
        System.out.println(c1.calcularPerimetro());
        System.out.println(c2.calcularPerimetro());
    }

    @Test
    void calcularPerimetroQuadrado(){
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularPerimetro());
    }
}