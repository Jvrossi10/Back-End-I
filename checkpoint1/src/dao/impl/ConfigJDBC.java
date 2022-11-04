package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConfigJDBC {

        private String jdbcDriver;
        private String dbUrl;
        private String nomeUsuario;
        private String senha;

        public ConfigJDBC(String jdbcDriver, String dbUrl, String nomeUsuario, String senha) {
            this.jdbcDriver = jdbcDriver;
            this.dbUrl = dbUrl;
            this.nomeUsuario = nomeUsuario;
            this.senha = senha;
        }

        public ConfigJDBC(){
            this.jdbcDriver = "org.h2.Driver";
            this.dbUrl = "jdbc:h2:mem:hotel;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
            this.nomeUsuario = "sa";
            this.senha="";
        }

        public Connection conectarComBancoDeDados() {
            Connection connection = null;

            try {
                connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return connection;
        }

}
