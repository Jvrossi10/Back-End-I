package TesteConexao.mesa_de_trabalho;

import org.h2.command.Prepared;

import java.sql.*;

public class Main {

    private static final String sqlCreate = "DROP TABLE IF EXISTS Dentista;" + "CREATE TABLE Dentista" +  "(id INT NOT NULL AUTO_INCREMENT, sobrenome VARCHAR(100) NOT NULL, nome VARCHAR(100) NOT NULL, matricula INT NOT NULL);";

    private static final String sqlInsert = "INSERT INTO Dentista(id, sobrenome, nome, matricula) VALUES(?,?,?,?);";

    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE id=?;";

    public static void main(String[] args) throws SQLException {

        Dentista dentista = new Dentista(1,"Silva", "José", 123456789);

        Connection connection = null;

        try {
            connection = Conexao.getConnection();

            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setString(1, dentista.getSobrenome());
            preparedStatementInsert.setString(2, dentista.getNome());
            preparedStatementInsert.setInt(3, dentista.getMatricula());
            preparedStatementInsert.execute();

            connection.setAutoCommit(false);

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setInt(1, dentista.mudarMatricula(789451));
            preparedStatementUpdate.setInt(2, dentista.getId());
            preparedStatementUpdate.execute();

            connection.commit();
            connection.setAutoCommit(true);

            String sql = "SELECT * FROM Dentista";
            Statement statement1 = connection.createStatement();
            ResultSet resultSet = statement1.executeQuery(sql);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getInt(4));
            }


        } catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }finally {
            connection.close();
        }

    }

}
