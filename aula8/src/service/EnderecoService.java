package service;

import dao.impl.IDao;
import model.Endereco;

public class EnderecoService {
    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco){
        return enderecoIDao.salvar(endereco);
    }

    public Endereco buscar(Integer id){
        return enderecoIDao.buscar(id);
    }
}
