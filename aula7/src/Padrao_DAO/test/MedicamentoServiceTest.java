package Padrao_DAO.test;

import Padrao_DAO.dao.ConfigJDBC;
import Padrao_DAO.dao.impl.MedicamentoDaoH2;
import Padrao_DAO.model.Medicamento;
import Padrao_DAO.service.MedicamentoService;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class MedicamentoServiceTest {

    private MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfigJDBC()));

    @Test
    public void guardarMedicamento(){
        Medicamento medicamento1 = new Medicamento("Ibuprofeno", "Aché", 300,23.00);
        medicamentoService.salvar(medicamento1);
        assertTrue(medicamento1.getId() != null);

        Medicamento medicamento2 = new Medicamento("Novalgina", "Medley", 200,8.50);
        medicamentoService.salvar(medicamento2);
        assertTrue(medicamento2.getId() != null);


    }

    @Test
    public void buscarPorId(){
        Medicamento medicamento1 = new Medicamento("Ibuprofeno", "Aché", 300,23.00);
        medicamentoService.buscar(medicamento1.getId());
        assertTrue(medicamento1.getId() != null);
    }

}
