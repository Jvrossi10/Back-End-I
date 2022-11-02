package test;

import dao.impl.ConfiguracaoJDBC;
import dao.impl.PacienteDAOH2;
import model.Paciente;
import org.junit.jupiter.api.Test;
import service.PacienteService;


import java.sql.Date;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PacienteServiceTest {
    private PacienteService pacienteService = new PacienteService(new PacienteDAOH2(new ConfiguracaoJDBC()));

    @Test
    public void salvarPaciente(){
        Paciente paciente = new Paciente(1, "Julia","Faria", "123568795", Date.valueOf("2022-11-07"));
        pacienteService.salvar(paciente);
        assertTrue(paciente.getId()!=null);

        Paciente paciente1 = new Paciente(2, "Monica","Benini", "854397521", Date.valueOf("2020-05-02"));
        pacienteService.salvar(paciente);
        assertTrue(paciente1.getId()!=null);
    }

    @Test
    public void buscarPorId(){

    }
}
