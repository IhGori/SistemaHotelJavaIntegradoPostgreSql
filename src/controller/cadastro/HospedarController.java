

package controller.cadastro;

import controller.helper.cadastro.HospedarHelper;
import dao.Conexao;
import dao.HospedarDAO;
import dao.PessoaDAO;
import dao.QuartoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Hospede;
import model.Pessoa;
import model.quarto.Quarto;
import model.reserva.Hospedar;
import view.cadastro.ReservaView;


public class HospedarController {
    private final ReservaView view;
    private final HospedarHelper helper;

    public HospedarController(ReservaView view) {
        this.view = view;
        this.helper = new HospedarHelper(view);
        
    }
    
      
     public void atualizaTabela() throws SQLException{
        
        //Busca lista com reservas do banco de dados
        Connection conexao = new Conexao().getConnection();
        HospedarDAO hospedarDao = new HospedarDAO(conexao);        
       //ReservaDAO reservaDao = new ReservaDAO(conexao);
        ArrayList<Hospedar> hospedars = hospedarDao.selectAll();
        //Exibir esta lista na view
        helper.preencherTabela(hospedars);
        
    }
    
  
      public void atualizaServico() throws SQLException{
        //Buscar Hospedes no banco de dados
        Connection conexao = new Conexao().getConnection();
        QuartoDAO quartoDao = new QuartoDAO(conexao);        
        ArrayList<Quarto>quartos = quartoDao.selectAll();
        
        //Exibir no combobox
        helper.preencherReservas(quartos);
    }
    
       public void atualizaPreco(){
          Quarto quarto = helper.obterPreco();
          helper.setarPreco(quarto.getPreco());
      }
       
        public void atualizaId_quarto(){
          Quarto quarto = helper.obterId_quarto();
          helper.setarId_quarto(quarto.getId_quarto());
      }
         
       
      public void atualizaHospede() throws SQLException{
        //Buscar Hospedes no banco de dados
        Connection conexao = new Conexao().getConnection();
        PessoaDAO pessoaDao = new PessoaDAO(conexao);        
        ArrayList<Pessoa>pessoas = pessoaDao.selectNome_id_hospede();
        
        //Exibir no combobox
        helper.preencherNomes(pessoas);
    }
    
        public void atualizaId_hospede(){
          Hospede hospede = helper.obterId_hospede();
          helper.setarId_hospede(hospede.getId_hospede());
      }
       
       
       
      
    public void reservar() throws SQLException{
        //Buscar hospedar no helper
        Hospedar hospedar = helper.obterModelo(); 
        //Salva o objeto no banco de dados
               try {
            Connection conexao = new Conexao().getConnection();
            HospedarDAO hospedarDao = new HospedarDAO(conexao);
            hospedarDao.insertHospedar(hospedar);
          
            
            JOptionPane.showMessageDialog(view, "Reserva salvo com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservaView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        helper.limptarTela();
    }
    
     
    
}
