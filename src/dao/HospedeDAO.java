

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Func;
import model.Hospede;
import model.Pessoa;


public class HospedeDAO {
    private final Connection connection;
    
    
    public HospedeDAO (Connection connection){
        this.connection = connection;
    }
    
    public void insertHospede(Hospede hospede) throws SQLException{
        
        String sql = "insert into hospede(id_hospede,cpf) values (?,?);";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, hospede.getId_hospede());
        statement.setString(2, hospede.getCpf());
        
              
       
        statement.execute();
    }
    
     public void updateHospede(Hospede hospede) throws SQLException{
         String sql = "update hospede set cpf = ?, where id_hospede = ?";         
            PreparedStatement statement = connection.prepareStatement(sql);
        
       
        statement.setString(1,  hospede.getCpf());
            
                   
            statement.execute();
    }
    
     public void insertOrUpdate(Hospede hospede) throws SQLException{
        //Se for maior que zero quer dizer que tem gerente, senao ele insere
         if(hospede.getId_hospede() > 0){
             updateHospede(hospede);
         }else{
             insertHospede(hospede);
         }           
        
    }
    
    public void deleteHospede(Hospede hospede) throws SQLException{
        
        String sql = "delete from hospede where id_hospede = ?";         
        PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, hospede.getId_hospede());            
            statement.execute();
        
    }
    
    //Mostrar todos cadastros
    public ArrayList<Hospede> selectAll() throws SQLException{
        
    String sql = "select * from hospede;";         
    PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);  
}
    
  
    private ArrayList<Hospede> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while(resultSet.next()){
            int id_hospede = resultSet.getInt("id_hospede");
            String cpf = resultSet.getString("cpf");
                        
                        
            
            Hospede usuarioComDadosDoBanco = new Hospede(id_hospede,cpf);
            hospedes.add(usuarioComDadosDoBanco); //Adiciona em funcionarios os dados dos usuariosComDadosDoBanco (função do array list)
        }
        
        return hospedes;
    }
    
    
     public Hospede selectPorId_hospede(Hospede hospede) throws SQLException{
        
        String sql = "select * from hospede where id_hospede = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);        
        statement.setInt(1, hospede.getId_hospede());
        
        return pesquisa(statement).get(0);      
    }
     
    
     
     public boolean autenticarFuncPorLoginESenha(Hospede hospedeAutenticar) throws SQLException {
        
        String sql = "select * from hospede where usuario = ? and senha = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, hospedeAutenticar.getUsuario());
        statement.setString(2, hospedeAutenticar.getSenha());
        
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet.next();
    }

      
 
}
