package Facade_Pattern.mesa_de_trabalho;

import java.util.HashMap;

public class APIVoo {


    public String reservarVoo(Viagem viagem) {
        HashMap<Integer, Voo> vooMap = new HashMap<>();
        Integer i = 0;
        if(vooMap.isEmpty()){
            Voo voo1 = new Voo(viagem.getDataPartida(),viagem.getOrigem(), viagem.getDestino());
            vooMap.put(i++, voo1);
        }


        return "";
    }

}
