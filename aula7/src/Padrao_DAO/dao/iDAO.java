package Padrao_DAO.dao;

public interface iDAO<T> {

    public T salvar(T t);
    public T buscar(Integer id);

}
