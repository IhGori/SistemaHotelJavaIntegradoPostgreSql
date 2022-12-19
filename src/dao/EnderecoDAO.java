

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.informacao.Endereco;



public class EnderecoDAO {
    
    private final Connection connection;
    
    
    public EnderecoDAO (Connection connection){
        this.connection = connection;
    }
    
    public void insertEndereco (Endereco endereco) throws SQLException{
        
        String sql = "insert into endereco(logradouro,numero_residencia,bairro,cep,municipio,estado,cpf) values (?,?,?,?,?,?,?);";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, endereco.getLogradouro());
        statement.setString(2, endereco.getNumero_residencia());
        statement.setString(3, endereco.getBairro());
        statement.setString(4, endereco.getCep());
        statement.setString(5, endereco.getMunicipio());
        statement.setString(6, endereco.getEstado());
        statement.setString(7, endereco.getCpf());
        
       
        statement.execute();
    }
    
    

}
