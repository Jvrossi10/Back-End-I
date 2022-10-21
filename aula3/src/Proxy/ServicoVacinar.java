package Proxy;

import java.util.Date;

public class ServicoVacinar implements Vacinar {

    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String nomeVacina) {
        System.out.println("Usuário(a) de número de RG: " + rg + "vacinado(a) em: " + dataVacina + "com sucesso!");
    }

}
