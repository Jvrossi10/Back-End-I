package Flyweight_Pattern.mesa_de_trabalho;

import java.util.ArrayList;
import java.util.List;

public class Floresta {

    private static final List<Arvore> ARVORE = new ArrayList<>();


    public void plantarArvore(String tipoArvore, int altura, int largura, String cor){
        Arvore arvore = ArvoreFactory.getArvores(tipoArvore, altura, largura, cor);
        ARVORE.add(arvore);
    }

    public List<Arvore> getARVORE() {
        return ARVORE;
    }
}
