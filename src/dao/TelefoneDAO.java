

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.informacao.Telefone;



public class TelefoneDAO {

     private final Connection connection;
    
    
    public TelefoneDAO (Connection connection){
        this.connection = connection;
    }
    
    public void insertTelefone (Telefone telefone) throws SQLException{
        
        String sql = "insert into telefone(ddd,numero_telefone,cpf) values (?,?,?);";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1,telefone.getDdd());
        statement.setString(2,telefone.getNumero_telefone());
        statement.setString(3,telefone.getCpf());
       
    
        
       
        statement.execute();
    }
    
}
