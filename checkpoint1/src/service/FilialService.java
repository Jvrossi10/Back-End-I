package service;

import dao.impl.iDAO;
import model.Filial;

public class FilialService {

    private iDAO<Filial> filialIDao;

    public FilialService(iDAO<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvar(Filial filial){
        return filialIDao.salvar(filial);
    }

    public Filial buscar(Integer id){
        return filialIDao.buscar(id);
    }

}
