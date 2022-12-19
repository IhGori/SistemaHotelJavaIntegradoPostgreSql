

package controller.cadastro;

import controller.helper.cadastro.CadastroFuncHelper;
import controller.helper.cadastro.CadastroHospedeHelper;
import dao.Conexao;
import dao.DepartamentoDAO;
import dao.FuncDAO;
import dao.HospedeDAO;
import dao.PessoaDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Func;
import model.Hospede;
import model.Pessoa;
import model.departamento.Departamento;
import view.cadastro.CadastroFuncView;
import view.cadastro.CadastroHospede_NovoView;
import view.cadastro.CadastroPessoaView;


public class CadastroHospedeController {
    private final CadastroHospede_NovoView view;
     private final CadastroHospedeHelper helper;
     
     public CadastroHospedeController(CadastroHospede_NovoView view) {
        this.view = view;
        this.helper = new CadastroHospedeHelper(view);
      
        
    }
    
     
     
 public void salvaHospede() throws ParseException {
     
  Hospede hospedeI = (Hospede) helper.obterModelo();
 
     
     try {
            Connection conexao = new Conexao().getConnection();
            HospedeDAO hospedeDao = new HospedeDAO(conexao);
            hospedeDao.insertHospede(hospedeI);
            
            
            JOptionPane.showMessageDialog(view, "Hospede salvo com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
 
   public void atualizaCpf() throws SQLException{
        //Buscar Hospedes no banco de dados
        Connection conexao = new Conexao().getConnection();
        PessoaDAO pessoaDao = new PessoaDAO(conexao);        
        ArrayList<Pessoa>pessoas = pessoaDao.selectAll();
        
        //Exibir no combobox
        helper.preencherCpf(pessoas);
    }

   
   public void atualizaNome(){
          Pessoa pessoa = helper.obterNome();
          helper.setarValor(pessoa.getCpf());
      }
     
 
}
