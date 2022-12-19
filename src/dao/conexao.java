

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    public Connection getConnection() throws SQLException{
       //Fazendo a conexão com o banco de dados
           
       Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vhotelaria","userPostgres","passwordPsostgres");
       return conexao;
}

}