package Padrao_DAO.dao.impl;

import Padrao_DAO.dao.ConfigJDBC;
import Padrao_DAO.dao.iDAO;
import Padrao_DAO.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MedicamentoDaoH2 implements iDAO<Medicamento> {

    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(MedicamentoDaoH2.class);

    public MedicamentoDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {

        log.debug("Registrando um novo medicamento..." +medicamento.toString());
        Connection connection = configJDBC.conectarComBancoDeDados();
        Statement statement = null;

        String query = String.format("INSERT INTO Medicamento(nome, laboratorio,qtd,preco) VALUES('%s','%s','%s','%s')", medicamento.getNome(), medicamento.getLaboratorio(), medicamento.getQtd(), medicamento.getPreco());

        try{

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                medicamento.setId(keys.getInt(1));
            }

            statement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Medicamento buscar(Integer id) {
        log.debug("Buscando medicamento por ID: " + id);
        Connection connection = configJDBC.conectarComBancoDeDados();

        Statement statement2 = null;

        String query = String.format("SELECT id,nome,laboratorio,qtd,preco FROM Medicamentos WHERE id = '%s",id);
        Medicamento medicamento = null;

        try {
            statement2 = connection.createStatement();
            ResultSet resultSet = statement2.executeQuery(query);

            while (resultSet.next()){
                medicamento = new Medicamento(resultSet.getInt("id"), resultSet.getString("nome"),resultSet.getString("laboratorio"),resultSet.getInt("qtd"),resultSet.getDouble("preco"));
            }

            statement2.close();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }


        return medicamento;
    }
}
