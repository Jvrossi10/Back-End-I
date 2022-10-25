package Flyweight_Pattern.mesa_de_trabalho;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArvoreFactory {

    public static Map<String, Arvore>   TIPO_ARVORES = new HashMap<>();
    public static Arvore getArvores(String tipoArvore, int altura, int largura, String cor){
        Arvore arvore = TIPO_ARVORES.get(tipoArvore);
        if(Objects.isNull(arvore)){
            arvore = new Arvore(altura, largura, cor, tipoArvore);
            TIPO_ARVORES.put(tipoArvore, arvore);
            return arvore;
        }
        return arvore;
    }

}
