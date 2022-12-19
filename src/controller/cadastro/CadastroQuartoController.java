

package controller.cadastro;

import controller.helper.cadastro.CadastroQuartoHelper;
import dao.Conexao;
import dao.QuartoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.quarto.Quarto;
import view.cadastro.CadastroPessoaView;
import view.cadastro.CadastroQuarto_novoView;


public class CadastroQuartoController {
    
    private final CadastroQuarto_novoView view;
     private final CadastroQuartoHelper helper;
     
     public CadastroQuartoController(CadastroQuarto_novoView view) {
        this.view = view;
        this.helper = new CadastroQuartoHelper(view);
      
        
    }
     
     
 public void salvaQuarto() throws ParseException {
     
  Quarto quartoI = (Quarto) helper.obterModelo();
  
     try {
            Connection conexao = new Conexao().getConnection();
            QuartoDAO quartoDao = new QuartoDAO(conexao);
            quartoDao.insertQuarto(quartoI);
            
            
            JOptionPane.showMessageDialog(view, "Quarto salvo com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

 
  public void atualizaTabelaQuarto() throws SQLException{
        
        //Busca lista com reservas do banco de dados
        Connection conexao = new Conexao().getConnection();
        QuartoDAO quartoDao = new QuartoDAO(conexao);        
       //ReservaDAO reservaDao = new ReservaDAO(conexao);
        ArrayList<Quarto> quartos = quartoDao.selectAll();
        //Exibir esta lista na view
        helper.preencherTabelaQuarto(quartos);
        
    }
}
