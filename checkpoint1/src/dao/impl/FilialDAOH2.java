package dao.impl;

import model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class FilialDAOH2 implements iDAO<Filial> {

    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(FilialDAOH2.class);

    public FilialDAOH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Filial salvar(Filial filial){
        log.debug("Registrando uma nova filial: " + filial.toString());

        Connection connection = configJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO Hotel (id, nomeFilial, rua, numero, cidade, estado, eh5Estrelas) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s')",
                filial.getId(), filial.getNomeFilial(), filial.getRua(), filial.getNumero(),filial.getCidade(), filial.getEstado(), filial.isEh5Estrelas()
        );

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                filial.setId(resultSet.getInt(1));
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return filial;
    }

    @Override
    public Filial buscar(Integer id) {
        log.debug("Buscando filial: " + id);

        Connection connection = configJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT id, nomeFilial, rua, numero, cidade, estado, eh5Estrelas");

        Filial filial = null;

        try{
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while ((resultSet.next())){
                filial = new Filial(resultSet.getInt("id"),
                        resultSet.getString("nomeFilial"), resultSet.getString("rua"), resultSet.getInt("numero"), resultSet.getString("cidade"), resultSet.getString("estado"), resultSet.getBoolean("eh5Estrelas"));
            }

            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return filial;
    }
}
