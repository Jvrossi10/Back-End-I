package dao.impl;

import model.Endereco;
import model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PacienteDAOH2 implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(PacienteDAOH2.class);

    public PacienteDAOH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        log.debug("Registrando um novo paciente: "+ paciente.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO Pacientes(nome, sobrenome, rg, dataCadastro) VALUES ('%s', '%s','%s','%s')",
                paciente.getNome(), paciente.getSobrenome(), paciente.getRg(), paciente.getDataCadastro()
        );
        
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next())
                paciente.setId(keys.getInt(1));
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Paciente buscar(Integer id) {
        log.debug("Buscando paciente por id: "+ id);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("SELECT id, nome, sobrenome, rg, dataCadastro FROM pacientes WHERE id ='%s'",id);
        Paciente paciente = null;

        try{
            stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()){
                paciente = new Paciente(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("sobrenome"), resultSet.getString("rg"), resultSet.getDate("dataCadastro"));
            }
            stmt.close();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return paciente;
    }

}
