package ConexaoBD.mesa_de_trabalho;

import org.h2.tools.Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {

        // Server server = Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start();

        Class.forName("org.h2.Driver").newInstance();

        //Connection connection = DriverManager.getConnection("jdbc:h2:~/test;AUTO_SERVER_PORT=22755", "sa", "");
        //Connection connection = DriverManager.getConnection("jdbc:h2:file:~/test", "sa", "");
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement statement = connection.createStatement();


        String sqlCreateTable = "DROP TABLE IF EXISTS Figura; CREATE TABLE Figura" + "(" + "Id INT AUTO_INCREMENT PRIMARY KEY," + "TipoFigura VARCHAR(20) NOT NULL," + "Cor VARCHAR(20) NOT NULL" + ");";
        statement.execute(sqlCreateTable);

        String sqlInsert1 = "INSERT INTO Figura (Id, TipoFigura, Cor) VALUES (1, 'Circulo', 'Vermelho');";
        String sqlInsert2 = "INSERT INTO Figura (Id, TipoFigura, Cor) VALUES (2, 'Circulo', 'Amarelo');";
        String sqlInsert3 = "INSERT INTO Figura (Id, TipoFigura, Cor) VALUES (3, 'Quadrado', 'Vermelho');";
        String sqlInsert4 = "INSERT INTO Figura (Id, TipoFigura, Cor) VALUES (4, 'Quadrado', 'Lilás');";
        String sqlInsert5 = "INSERT INTO Figura (Id, TipoFigura, Cor) VALUES (5, 'Quadrado', 'Rosa');";

        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);
        statement.execute(sqlInsert3);
        statement.execute(sqlInsert4);
        statement.execute(sqlInsert5);

        String sqlQuery = "SELECT TipoFigura, Cor FROM Figura WHERE TipoFigura='Circulo' AND Cor='Vermelho';";

        ResultSet resultSet = statement.executeQuery(sqlQuery);


        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString(1) +  " - " + resultSet.getString(2)
            );
        }

    }

}
