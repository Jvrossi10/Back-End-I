package Chain_of_Responsability.mesa_de_trabalho;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArtigoTest {

    @Test
    public void teste01(){
        //FORÇAR LOTE INVALIDO
        Artigo artigo1 = new Artigo("Doritos", "Saudável",900,1250);
        CheckQuality checkQuality = new CheckQuality();
        checkQuality.verificar(artigo1);
        System.out.println("------------------------------");
    }

    @Test
    public void teste02(){
        //FORÇAR PESO INVALIDO
        Artigo artigo2 = new Artigo("Doritos", "Saudável",1900,1550);
        CheckQuality checkQuality = new CheckQuality();
        checkQuality.verificar(artigo2);
        System.out.println("------------------------------");

    }

    @Test
    public void teste03(){
        //FORÇAR EMBALAGEM INVALIDA
        Artigo artigo4 = new Artigo("Doritos", "Não saudavel",1900,1250);
        CheckQuality checkQuality = new CheckQuality();
        checkQuality.verificar(artigo4);
        System.out.println("-----------------------------------");

    }

    @Test
    public void teste04(){
        //TODOS OS CAMPOS CORRETOS
        Artigo artigo5 = new Artigo("Doritos", "Saudável",1900,1250);
        CheckQuality checkQuality = new CheckQuality();
        checkQuality.verificar(artigo5);
        System.out.println("-----------------------------------");

    }

 }

