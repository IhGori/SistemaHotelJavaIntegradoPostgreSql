

package controller.cadastro;

import controller.helper.cadastro.CadastroFuncHelper;
import dao.Conexao;
import dao.DepartamentoDAO;
import dao.FuncDAO;
import dao.PessoaDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Func;
import model.Pessoa;
import model.departamento.Departamento;
import view.cadastro.CadastroFuncView;
import view.cadastro.CadastroPessoaView;


public class CadastroFuncController {

    private final CadastroFuncView view;
     private final CadastroFuncHelper helper;
     
     public CadastroFuncController(CadastroFuncView view) {
        this.view = view;
        this.helper = new CadastroFuncHelper(view);
      
        
    }
     

     
     
   public void atualizaNome() throws SQLException{
        //Buscar Hospedes no banco de dados
        Connection conexao = new Conexao().getConnection();
        PessoaDAO pessoaDao = new PessoaDAO(conexao);        
        ArrayList<Pessoa>pessoas = pessoaDao.selectAll();
        
        //Exibir no combobox
        helper.preencherNome(pessoas);
    }
   
   
   public void atualizaCpf(){
          Pessoa pessoa = helper.obterNome();
          helper.setarValor(pessoa.getCpf());
      }
     
     public void atualizaDepartamento() throws SQLException{
        //Buscar Hospedes no banco de dados
        Connection conexao = new Conexao().getConnection();
        DepartamentoDAO departamentoDao = new DepartamentoDAO(conexao);        
        ArrayList<Departamento>departamentos = departamentoDao.selectAll();
        
        //Exibir no combobox
        helper.preencherDepartamento(departamentos);
    }
     
     public void atualizaId_dept(){
          Departamento departamento = helper.obterId_dept();
          helper.setarValor2(departamento.getId_dept());
      }
     
     
     
     
     
 public void salvaFunc() throws ParseException {
     
  Func funcI = (Func) helper.obterModelo();
 
     
     try {
            Connection conexao = new Conexao().getConnection();
            FuncDAO funcDao = new FuncDAO(conexao);
            funcDao.insertFunc(funcI);
            
            
            JOptionPane.showMessageDialog(view, "Funcionário salvo com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void atualizaPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
  
}
