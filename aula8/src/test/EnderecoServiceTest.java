package test;

import dao.impl.ConfiguracaoJDBC;
import dao.impl.EnderecoDAOH2;
import dao.impl.PacienteDAOH2;
import model.Endereco;
import model.Paciente;
import org.junit.jupiter.api.Test;
import service.EnderecoService;
import service.PacienteService;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnderecoServiceTest {
    private EnderecoService enderecoService = new EnderecoService(new EnderecoDAOH2(new ConfiguracaoJDBC()));

    @Test
    public void salvarEndereco(){
        Endereco endereco = new Endereco(1, "Capricornio",1, "São José dos Campos", "Jardim da Granja");
        enderecoService.salvar(endereco);
        assertTrue(endereco.getId()!=null);

        Endereco endereco1 = new Endereco(2, "São Cristóvão",426, "Taubaté", "Vila São José");
        enderecoService.salvar(endereco);
        assertTrue(endereco1.getId()!=null);
    }

    @Test
    public void buscarPorId(){

    }
}