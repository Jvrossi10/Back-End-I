package test;

import dao.impl.ConfigJDBC;
import dao.impl.FilialDAOH2;
import model.Filial;
import org.junit.jupiter.api.Test;
import service.FilialService;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilialServiceTest {

    private FilialService filialService = new FilialService(new FilialDAOH2(new ConfigJDBC()));

    @Test
    public void salvarFiliais(){
        Filial filial1 = new Filial(1, "filial1", "Rua A", 123, "Rio de Janeiro", "Rio de Janeiro", true);
        filialService.salvar(filial1);
        assertTrue(filial1.getId() == 1);
        Filial filial2 = new Filial(2, "filial2", "Rua B", 456, "São Paulo", "São Paulo", true);
        filialService.salvar(filial2);
        assertTrue(filial2.getId() == 2);
        Filial filial3 = new Filial(3, "filial3", "Rua C", 789, "Belo Horizonte", "Minas Gerais", true);
        filialService.salvar(filial3);
        assertTrue(filial3.getId() == 3);
        Filial filial4 = new Filial(4, "filial4", "Rua D", 012, "Curitiba", "Paraná", true);
        filialService.salvar(filial4);
        assertTrue(filial4.getId() == 4);
        Filial filial5 = new Filial(5, "filial5", "Rua E", 345, "Brasília", "Distrito Federal", true);
        filialService.salvar(filial5);
        assertTrue(filial5.getId() == 5);

    }




}
