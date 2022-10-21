package Proxy;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class PessoaTest {

    Date data = new Date();

    @Test
    public void Vacinar1(){
        Pessoa p1 = new Pessoa("Anderson", "Silva", "5544662349","Butantã", data);
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }

}
