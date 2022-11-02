package Padrao_DAO.service;

import Padrao_DAO.dao.iDAO;
import Padrao_DAO.model.Medicamento;

import javax.swing.*;

public class MedicamentoService {

    private iDAO<Medicamento> medicamentoiDAO;

    public MedicamentoService(iDAO<Medicamento> medicamentoiDAO) {
        this.medicamentoiDAO = medicamentoiDAO;
    }

    public Medicamento salvar(Medicamento medicamento){
        return medicamentoiDAO.salvar(medicamento);
    }
    public Medicamento buscar(Integer id){
        return medicamentoiDAO.buscar(id);
    }
}
