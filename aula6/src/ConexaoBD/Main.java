package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {

    public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver").newInstance();

        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement statement = connection.createStatement(); // vai enviar a query para o banco de dados

        String sqlCreateTable = "DROP TABLE IF EXISTS Animal; CREATE TABLE Animal" + "(" +
                "Id INT PRIMARY KEY" +
                "Nome VARCHAR(150) NOT NULL" +
                "Tipo VARCHAR(150) NOT NULL" + ")";
        statement.execute(sqlCreateTable);

        String sqlInsert1 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (1, 'Meg', 'Cadela')";
        String sqlInsert2 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (2, 'Mingau', 'Gato')";
        String sqlInsert3 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (3, 'Dumbo', 'Elefante')";
        String sqlInsert4 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (4, 'Suzy', 'Cadela')";
        String sqlInsert5 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (5, 'Pé de pano', 'Cachorro')";

        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);
        statement.execute(sqlInsert3);
        statement.execute(sqlInsert4);
        statement.execute(sqlInsert5);

        String sqlDelete = "DELETE FROM Animal WHERE Id=2";
        statement.execute(sqlDelete);

        String sqlQuery = "SELECT * FROM Animal";
        statement.execute(sqlDelete);

        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }

    }

}
