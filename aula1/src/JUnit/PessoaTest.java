package JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setIdade(LocalDate.of(2016, 3, 23));

        p2 = new Pessoa("Ana", "Musk");
        p2.setIdade(LocalDate.of(1996, 1, 10));

        p3 = new Pessoa("Joe", "Sacadas");
        p3.setIdade(LocalDate.of(2010, 6, 1));

        p4 = new Pessoa("Rob", "Varandas");
        p4.setIdade(LocalDate.of(1976, 7, 15));

        p5 = new Pessoa("Ted", "Santos");
        p5.setIdade(LocalDate.of(2014, 4, 12));

        p6 = new Pessoa("Roberto", "Silva");
        p6.setIdade(LocalDate.of(2000, 12, 20));

        p7 = new Pessoa("Renata", "Gomes");
        p7.setIdade(LocalDate.of(2010, 8, 7));

        p8 = new Pessoa("Murilo", "Seixas");
        p8.setIdade(LocalDate.of(2015, 9, 13));

        p9 = new Pessoa("Candido", "Portinari");
        p9.setIdade(LocalDate.of(1975, 5, 29));

        p10 = new Pessoa("Camila", "Pitanga");
        p10.setIdade(LocalDate.of(2014, 5, 3));
    }

    @Test
    void imprimirObjetos() {
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void adicionarColecao() {
        p1.adicionarNomes(p1);
        p1.adicionarNomes(p2);
        p1.adicionarNomes(p3);
        p1.adicionarNomes(p4);
        p1.adicionarNomes(p5);
        p1.adicionarNomes(p6);
        p1.adicionarNomes(p7);
        p1.adicionarNomes(p8);
        p1.adicionarNomes(p9);
        p1.adicionarNomes(p10);

    }
}