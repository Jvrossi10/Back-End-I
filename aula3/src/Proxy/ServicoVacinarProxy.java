package Proxy;

import java.util.Date;

public class ServicoVacinarProxy implements Vacinar{

    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String nomeVacina) {

        if(dataVacina.before(new Date())){
            ServicoVacinar servicoVacinar = new ServicoVacinar();
            servicoVacinar.vacinarPessoa(rg,dataVacina,nomeVacina);
            System.out.println("Cidadão(ã) vacinado(a) com sucesso!");
        } else {
            System.out.println("A data de hoje é anterior a data marcada!");
        }

    }
}


