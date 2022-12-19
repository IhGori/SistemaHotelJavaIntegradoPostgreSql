

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.reserva.Hospedar;



public class HospedarDAO {
    private final Connection connection;
    

    public HospedarDAO(Connection connection) {
        this.connection = connection;
           }

    
        
    public void insertHospedar(Hospedar hospedar) throws SQLException{
        
        
        String sql = "insert into hospedagem(id_reserva,hora_reserva,data_check_in,data_check_out,valor_total,observacao,id_hospede,id_quarto) values (?,?,?,?,?,?,?,?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, hospedar.getId_reserva());
        statement.setString(2, hospedar.getHora_reserva());
        statement.setDate(3, (Date) hospedar.getData_check_in());
        statement.setDate(4, (Date) hospedar.getData_check_out());
        statement.setDouble(7, hospedar.getValor_total());
        statement.setString(8, hospedar.getObservacao());
        statement.setInt(5, hospedar.getId_hospede());
        statement.setInt(6, hospedar.getId_quarto());
        
        statement.execute();
    
    }       
    
    public void deleteHospedar(Hospedar hospedar) throws SQLException{
        String sql = "delete from hospedagem where id_reserva = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, hospedar.getId_reserva());
        statement.execute();
    }
    
     public ArrayList<Hospedar> selectAll() throws SQLException {
        
        String sql = "select * from hospedagem";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
             
        
        return pesquisa(statement);
    }
   
    

    private ArrayList<Hospedar> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Hospedar> hospedars = new ArrayList<Hospedar>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            
            int id_reserva = resultSet.getInt("id_reserva");
            String hora_reserva = resultSet.getString("hora_reserva");
            Date data_check_in = resultSet.getDate("data_check_in");
            Date data_check_out = resultSet.getDate("data_check_out");
            double valor_total = resultSet.getDouble("valor_total");
            String observacao = resultSet.getString("observacao");
            int id_hospede = resultSet.getInt("id_hospede");
            int id_quarto = resultSet.getInt("id_quarto");
            
          
            
            
            Hospedar hospedarComDadosDoBanco = new Hospedar(id_reserva, hora_reserva, data_check_in, data_check_out, valor_total, observacao, id_hospede, id_quarto);
            hospedars.add(hospedarComDadosDoBanco); //Adiciona em reservas os dados dos usuariosComDadosDoBanco (função do array list)
        }
        
        return hospedars;
    }
    
     
    
    
    public Hospedar selectPorIdHospedar(Hospedar hospedar) throws SQLException{
        String sql = "select * from hospedagem where id_reserva = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, hospedar.getId_reserva());
        
        return pesquisa(statement).get(0);
       
        
    }
}
