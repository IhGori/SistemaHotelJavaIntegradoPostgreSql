

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.quarto.Quarto;


public class QuartoDAO {
     private final Connection connection;
    
    
    public QuartoDAO (Connection connection){
        this.connection = connection;
    }
    
    public void insertQuarto(Quarto quarto) throws SQLException{
        
        String sql = "insert into quarto(id_quarto,tipo_quarto,preco) values (?,?,?);";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1,quarto.getId_quarto());
        statement.setString(2,quarto.getTipo_quarto());
        statement.setDouble(3,quarto.getPreco());
        
                   
       
        statement.execute();
    }
    
     public void updateQuarto(Quarto quarto) throws SQLException{
         String sql = "update quarto set tipo_quarto = ?, preco = ?, where cpf = ?";         
            PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1,quarto.getTipo_quarto());
        statement.setDouble(2,quarto.getPreco());
      
                   
            statement.execute();
    }
    
    
    public void deleteQuarto(Quarto quarto) throws SQLException{
        
        String sql = "delete from quarto where id_quarto = ?";         
        PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, quarto.getId_quarto());            
            statement.execute();
        
    }
    
    //Mostrar todos cadastros
    public ArrayList<Quarto> selectAll() throws SQLException{
        
    String sql = "select * from quarto;";         
    PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);  
}
    
  
    private ArrayList<Quarto> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Quarto> quartos = new ArrayList<Quarto>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while(resultSet.next()){
            
            int id_quarto = resultSet.getInt("id_quarto");
            String tipo_quarto = resultSet.getString("tipo_quarto");
            double preco = resultSet.getDouble("preco");
                     
                        
            
            Quarto usuarioComDadosDoBanco = new Quarto(id_quarto,tipo_quarto,preco);
            quartos.add(usuarioComDadosDoBanco); //Adiciona em quartos os dados dos usuariosComDadosDoBanco (função do array list)
        }
        
        return quartos;
    }
    
    
     public Quarto selectPorId_quarto(Quarto quarto) throws SQLException{
        
        String sql = "select * from quarto where id_quarto = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);        
        statement.setInt(1, quarto.getId_quarto());
        
        return pesquisa(statement).get(0);      
    }
     
     public Quarto selectPorNome_quarto(Quarto quarto) throws SQLException{
        
        String sql = "select * from quarto where tipo_quarto = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);        
        statement.setString(1, quarto.getTipo_quarto());
        
        return pesquisa(statement).get(0);      
    }
}
