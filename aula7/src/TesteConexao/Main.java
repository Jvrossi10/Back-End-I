package TesteConexao;

import java.sql.*;

public class Main {

    public static final String sqlCreate = "DROP TABLE IF EXISTS Conta;" + "CREATE TABLE Conta" +
            "(" +
            "id INT PRIMARY KEY," +
            "nome VARCHAR(150) NOT NULL," +
            "numConta VARCHAR(150) NOT NULL," +
            "saldo NUMERIC(15,2)" +
            ");";

    private static final String sqlInsert = "INSERT INTO Conta(id,nome,numConta,saldo) VALUES(?,?,?,?);";

    private static final String sqlUpdate = "UPDATE Conta SET saldo=? WHERE id=?;";

    public static void main(String args[]) throws SQLException {
        Conta conta = new Conta(1, "Clebson", "23ds456789", 30d);
        Connection connection = null;

        try{
            connection=ConnectionJDBC.getConnection();
            Statement statment = connection.createStatement();
            statment.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setInt(1, conta.getId());
            preparedStatementInsert.setString(2, conta.getNome());
            preparedStatementInsert.setString(3, conta.getNumConta());
            preparedStatementInsert.setDouble(4, conta.getSaldo());
            preparedStatementInsert.execute();

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setDouble(1, conta.aumentarSaldo(10d));
            preparedStatementUpdate.setInt(2, conta.getId());
            preparedStatementUpdate.execute();

            connection.setAutoCommit(false);

            PreparedStatement preparedStatementUpdate2 = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate2.setDouble(1,conta.aumentarSaldo(15d));
            preparedStatementUpdate2.setInt(2, conta.getId());
            preparedStatementUpdate2.execute();

            connection.commit();
            connection.setAutoCommit(true);

            String sql = "SELECT * FROM Conta";
            Statement statement1 = connection.createStatement();
            ResultSet rs = statement1.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
            }

        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }finally {

            connection.close();
        }
    }

}
