

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.departamento.Departamento;


public class DepartamentoDAO {
    private final Connection connection;
    
    
    public DepartamentoDAO (Connection connection){
        this.connection = connection;
    }
    
    public void insertDepartamento (Departamento departamento) throws SQLException{
        
        String sql = "insert into departamento(id_dedpt,nome_dept) values (?,?);";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        
        statement.setInt(1, departamento.getId_dept());
        statement.setString(2, departamento.getNome_dept());
       
       
        statement.execute();
    }
    
     public void updateDepartamento(Departamento departamento) throws SQLException{
         String sql = "update departamento set id_dept = ?, nome_dept = ?, where id_dept = ?";         
            PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1,departamento.getId_dept());
        statement.setString(2,departamento.getNome_dept());
       
            statement.execute();
    }
    
     public void insertOrUpdate(Departamento departamento) throws SQLException{
        //Se for maior que zero quer dizer que tem departamento, senao ele insere
         if(departamento.getId_dept() > 0){
             updateDepartamento(departamento);
         }else{
             insertDepartamento(departamento);
         }           
        
    }
    
    public void deleteDepartamento(Departamento departamento) throws SQLException{
        
        String sql = "delete from departamento where id_dept = ?";         
        PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, departamento.getId_dept());            
            statement.execute();
        
    }
    
    //Mostrar todos cadastros
    public ArrayList<Departamento> selectAll() throws SQLException{
        
    String sql = "select * from departamento;";         
    PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);  
}
    
  
    private ArrayList<Departamento> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while(resultSet.next()){
            
            int id_dept = resultSet.getInt("id_dept");
            String nome_dept = resultSet.getString("nome_dept");
         
                        
            
            Departamento usuarioComDadosDoBanco = new Departamento(id_dept,nome_dept);
            departamentos.add(usuarioComDadosDoBanco); //Adiciona em departamentos os dados dos usuariosComDadosDoBanco (função do array list)
        }
        
        return departamentos;
    }
    
    
     public Departamento selectPorCpf(Departamento departamento) throws SQLException{
        
          String sql = "delete from departamento where id_dept = ?";      
          
          
            PreparedStatement statement = connection.prepareStatement(sql);            
            statement.setInt(1, departamento.getId_dept());          
            
           
            
            return pesquisa(statement).get(0); 

}
}
