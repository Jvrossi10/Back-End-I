package Flyweight_Pattern;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {

    private static Map<String, Computador> macFlyweight = new HashMap<>();
    //Esse Hashmap vai servir como uma memória que vai buscar uma informação que já existe

    public Computador getComputador(int ram, int hd){
        String id = "ID:  " + ram + " : " + hd;
        System.out.println(id);
        if(!macFlyweight.containsKey(id)){//Vamos dar um put dentro do map salvando assim o computador com sua ram e seu disco(hd)
            macFlyweight.put(id, new Computador(ram, hd));
            System.out.println("PC criado com sucesso!!");
            return macFlyweight.get(id);
        }
        System.out.println("PC obtido com sucesso!!");
        return macFlyweight.get(id);// vai retornar o pc criado
    }

}
