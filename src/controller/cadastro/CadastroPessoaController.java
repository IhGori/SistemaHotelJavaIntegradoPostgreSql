

package controller.cadastro;

import controller.helper.cadastro.CadastroPessoaHelper;
import dao.Conexao;
import dao.EnderecoDAO;
import dao.PessoaDAO;
import dao.TelefoneDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Pessoa;
import model.informacao.Endereco;
import model.informacao.Telefone;
import view.cadastro.CadastroPessoaView;


public class CadastroPessoaController {

     private final CadastroPessoaView view;
     private final CadastroPessoaHelper helper;
     
     public CadastroPessoaController(CadastroPessoaView view) {
        this.view = view;
        this.helper = new CadastroPessoaHelper(view);
      
        
    }
     
     
 public void salvaPessoa() throws ParseException {
     
  Pessoa pessoaI = (Pessoa) helper.obterModelo();
  Telefone telefoneI = (Telefone) helper.obterModelo_Telefone();
  Endereco enderecoI = (Endereco) helper.obterModelo_Endereco();
     
     try {
            Connection conexao = new Conexao().getConnection();
            PessoaDAO pessoaDao = new PessoaDAO(conexao);
            pessoaDao.insertPessoa(pessoaI);
            TelefoneDAO telefoneDao = new TelefoneDAO(conexao);
            telefoneDao.insertTelefone(telefoneI);
            EnderecoDAO enderecoDao = new EnderecoDAO(conexao);
            enderecoDao.insertEndereco(enderecoI);
            
            JOptionPane.showMessageDialog(view, "Pessoa salva com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
