

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Func;
import model.Pessoa;


public class FuncDAO {

     private final Connection connection;
    
    
    public FuncDAO (Connection connection){
        this.connection = connection;
    }
    
    public void insertFunc(Func func) throws SQLException{
        
        String sql = "insert into funcionario(matricula,pis,cnh,cpf,data_de_admissao,id_dept,cargo) values (?,?,?,?,?,?,?);";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1,func.getMatricula());
        statement.setString(2,func.getPis());
        statement.setString(3,func.getCnh());
        statement.setString(4,func.getCpf());
        statement.setDate(5, (Date) func.getData_de_admissao());
        statement.setInt(6,func.getId_dept());
        statement.setString(7,func.getCargo());
              
       
        statement.execute();
    }
    
     public void updateFunc(Func func) throws SQLException{
         String sql = "update funcionario set matricula = ?, pis = ?, cnh  = ?, data_de_admissao = ?, id_dept =  ?, cargo = ? where cpf = ?";         
            PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, func.getMatricula());
        statement.setString(2, func.getPis());
        statement.setString(3, func.getCnh());
        statement.setDate(4, (Date) func.getData_de_admissao());
        statement.setInt(5, func.getId_dept());
        statement.setString(6, func.getCargo());
            
                   
            statement.execute();
    }
    
     public void insertOrUpdate(Func func) throws SQLException{
        //Se for maior que zero quer dizer que tem gerente, senao ele insere
         if(func.getMatricula() > 0){
             updateFunc(func);
         }else{
             insertFunc(func);
         }           
        
    }
    
    public void deleteFunc(Func func) throws SQLException{
        
        String sql = "delete from func where matricula = ?";         
        PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, func.getMatricula());            
            statement.execute();
        
    }
    
    //Mostrar todos cadastros
    public ArrayList<Func> selectAll() throws SQLException{
        
    String sql = "select * from func;";         
    PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);  
}
    
  
    private ArrayList<Func> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Func> funcs = new ArrayList<Func>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while(resultSet.next()){
            int matricula = resultSet.getInt("matricula");
            String pis = resultSet.getString("pis");
            String cnh = resultSet.getString("cnh");
            String cpf = resultSet.getString("cpf");
            Date data_de_admissao = resultSet.getDate("data_de_admissao");
            int id_dept = resultSet.getInt("id_dept");
            String cargo = resultSet.getString("cargo");
            
                        
            
            Func usuarioComDadosDoBanco = new Func(matricula,pis,cnh,cpf,data_de_admissao,id_dept,cargo);
            funcs.add(usuarioComDadosDoBanco); //Adiciona em funcionarios os dados dos usuariosComDadosDoBanco (função do array list)
        }
        
        return funcs;
    }
    
    
     public Func selectPorMatricula(Func func) throws SQLException{
        
        String sql = "select * from funcionario where matricula = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);        
        statement.setInt(1, func.getMatricula());
        
        return pesquisa(statement).get(0);      
    }
     
     
       public boolean existePessoaPorLoginESenha(Pessoa pessoaAutenticar) throws SQLException {
        
        String sql = "SELECT * FROM funcionario WHERE usuario = ? and senha = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, pessoaAutenticar.getUsuario());
        statement.setString(2, pessoaAutenticar.getSenha());
        
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
       
    }


}
