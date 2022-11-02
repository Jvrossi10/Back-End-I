package service;

import dao.impl.IDao;
import model.Paciente;

public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvar(Paciente paciente){
        return pacienteIDao.salvar(paciente);
    }

    public Paciente buscar(Integer id){
        return pacienteIDao.buscar(id);
    }
}
