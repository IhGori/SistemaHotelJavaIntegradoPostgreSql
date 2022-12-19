

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


public class PessoaDAO {

    private final Connection connection;
    
    
    public PessoaDAO (Connection connection){
        this.connection = connection;
    }

    public void insertPessoa (Pessoa pessoa) throws SQLException{
        
        String sql = "insert into pessoa(cpf,nome_completo,sexo,data_de_nascimento,email,usuario,senha) values (?,?,?,?,?,?,?);";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1,pessoa.getCpf());
        statement.setString(2,pessoa.getNome_completo());
        statement.setString(3,pessoa.getSexo());
        statement.setDate(4, (Date) pessoa.getData_de_nascimento());
        statement.setString(5, pessoa.getEmail());
        statement.setString(6, pessoa.getUsuario());
        statement.setString(7, pessoa.getSenha());
    
        
       
        statement.execute();
    }
    
     public void updatePessoa(Pessoa pessoa) throws SQLException{
         String sql = "update pessoa set nome_completo = ?, sexo = ?, data_de_nascimento = ?, email =  ?, usuario = ?, senha = ?, where cpf = ?";         
            PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1,pessoa.getNome_completo());
        statement.setString(2,pessoa.getSexo());
        statement.setDate(3,(Date) pessoa.getData_de_nascimento());
        statement.setString(4, pessoa.getEmail());
        statement.setString(5, pessoa.getUsuario());
        statement.setString(6, pessoa.getSenha());
     
                   
            statement.execute();
    }
    
     public void insertOrUpdate(Pessoa pessoa) throws SQLException{
        //Se for maior que zero quer dizer que tem pessoa, senao ele insere
         if(Integer.parseInt(pessoa.getCpf()) > 0){
             updatePessoa(pessoa);
         }else{
             insertPessoa(pessoa);
         }           
        
    }
    
    public void deletePessoa(Pessoa pessoa) throws SQLException{
        
        String sql = "delete from pessoa where cpf = ?";         
        PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, Integer.parseInt(pessoa.getCpf()));            
            statement.execute();
        
    }
    
    //Mostrar todos cadastros
    public ArrayList<Pessoa> selectAll() throws SQLException{
        
    String sql = "select * from pessoa;";         
    PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);  
}
    
    
       //Mostrar todos cadastros
    public ArrayList<Pessoa> selectNome() throws SQLException{
        
    String sql = "SELECT pessoa.nome_completo, hospede.cpf, hospede.id_hospede FROM pessoa, hospede WHERE pessoa.cpf = hospede.cpf;";         
    PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa2(statement);  
}
    
    
      private ArrayList<Pessoa> pesquisa2(PreparedStatement statement) throws SQLException {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while(resultSet.next()){
            
            String cpf = resultSet.getString("cpf");
            String nome_completo = resultSet.getString("nome_completo");
            int id_pesquisa = resultSet.getInt("id_hospede");
            
                        
                        
            
            Pessoa usuarioComDadosDoBanco = new Pessoa(cpf,nome_completo, id_pesquisa);
            pessoas.add(usuarioComDadosDoBanco); //Adiciona em pessoas os dados dos usuariosComDadosDoBanco (função do array list)
        }
        
        return pessoas;
    }
  
    private ArrayList<Pessoa> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while(resultSet.next()){
            
            String cpf = resultSet.getString("cpf");
            String nome_completo = resultSet.getString("nome_completo");
            String sexo = resultSet.getString("sexo");
            Date data_de_nascimento = resultSet.getDate("data_de_nascimento");
            String email = resultSet.getString("email");
            String usuario = resultSet.getString("usuario");
            String senha = resultSet.getString("senha");
                        
                        
            
            Pessoa usuarioComDadosDoBanco = new Pessoa(cpf,nome_completo,sexo,data_de_nascimento,email,usuario,senha);
            pessoas.add(usuarioComDadosDoBanco); //Adiciona em pessoas os dados dos usuariosComDadosDoBanco (função do array list)
        }
        
        return pessoas;
    }
    
    
     public Pessoa selectPorCpf(Pessoa pessoa) throws SQLException{
        
          String sql = "delete from pessoa where cpf = ?";      
          
          
            PreparedStatement statement = connection.prepareStatement(sql);            
            statement.setInt(1, Integer.parseInt(pessoa.getCpf()));          
            
           
            
            return pesquisa(statement).get(0); 

}

      public boolean existePessoaPorLoginESenha(Pessoa pessoaAutenticar) throws SQLException {
        
        String sql = "SELECT * FROM pessoa WHERE usuario = ? and senha = ?;";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, pessoaAutenticar.getUsuario());
        statement.setString(2, pessoaAutenticar.getSenha());
        
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
       
    }
    
      
      
      
     public ArrayList<Pessoa> selectNome_id_hospede() throws SQLException{
        
    String sql = "SELECT hospede.cpf, pessoa.nome_completo, hospede.id_hospede FROM pessoa, hospede WHERE pessoa.cpf = hospede.cpf;";         
    PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa3(statement);  
}
    
    
      private ArrayList<Pessoa> pesquisa3(PreparedStatement statement) throws SQLException {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while(resultSet.next()){
            
            String cpf = resultSet.getString("cpf");
            String nome_completo = resultSet.getString("nome_completo");
            int id_pesquisa = resultSet.getInt("id_hospede");
            
     
                        
            Pessoa usuarioComDadosDoBanco = new Pessoa(cpf,nome_completo, id_pesquisa);
            pessoas.add(usuarioComDadosDoBanco); //Adiciona em pessoas os dados dos usuariosComDadosDoBanco (função do array list)
        }
        
        return pessoas;
    }        
 
}
