package Aula_Integradora_Proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ISerieTest {

    @Test
    public void teste001(){
        System.out.println("-------------------------");

        Serie serie01 = new Serie("Peaky Blinders");
        SerieProxy processo = new SerieProxy();

        System.out.println(serie01.getSerie(serie01.getNome()));
        System.out.println("1º vez: " + processo.getSerie(serie01.getNome()));
        System.out.println("2º vez: " + processo.getSerie(serie01.getNome()));
        System.out.println("3º vez: " + processo.getSerie(serie01.getNome()));
        System.out.println("4º vez: " + processo.getSerie(serie01.getNome()));
        System.out.println("5º vez: " + processo.getSerie(serie01.getNome()));
        System.out.println("6º vez: " + processo.getSerie(serie01.getNome()));
    }

    @Test
    public void teste002(){
        System.out.println("-------------------------");

        Serie serie02 = new Serie("Breaking Bad");
        SerieProxy processo = new SerieProxy();


        System.out.println(serie02.getSerie(serie02.getNome()));
        System.out.println("1º vez: " + processo.getSerie(serie02.getNome()));
        System.out.println("2º vez: " + processo.getSerie(serie02.getNome()));
        System.out.println("3º vez: " + processo.getSerie(serie02.getNome()));
        System.out.println("4º vez: " + processo.getSerie(serie02.getNome()));
        System.out.println("5º vez: " + processo.getSerie(serie02.getNome()));
        System.out.println("6º vez: " + processo.getSerie(serie02.getNome()));

    }


}