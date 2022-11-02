package dao.impl;

import model.Endereco;
import model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnderecoDAOH2 implements IDao<Endereco> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(EnderecoDAOH2.class);

    public EnderecoDAOH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        log.debug("Registrando um novo endereco: "+ endereco.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO enderecos(rua, numero, cidade, bairro) VALUES ('%s', '%s','%s','%s')",
                endereco.getRua(), endereco.getNumero(), endereco.getCidade(), endereco.getBairro());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next())
                endereco.setId(keys.getInt(1));
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Endereco buscar(Integer id) {
        log.debug("Buscando endereço por id: "+ id);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("SELECT id, rua, numero, cidade, bairro FROM enderecos WHERE id ='%s'",id);
        Endereco endereco = null;

        try{
            stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()){
                endereco = new Endereco(resultSet.getInt("id"), resultSet.getString("rua"), resultSet.getInt("numero"), resultSet.getString("cidade"), resultSet.getString("bairro"));
            }
            stmt.close();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return endereco;
    }

}