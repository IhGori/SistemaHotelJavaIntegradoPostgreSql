

package controller.login;

import dao.Conexao;
import dao.FuncDAO;
import dao.PessoaDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Func;
import model.Pessoa;
import view.login.LoginView;
import view.menu.MenuView;


public class LoginController {
    private final LoginView view;

    //Para criar um menu principal precisa passar um menu do tipo view, a partir disso 
    //consegue ter acesso a view no codigo abaixo

    public LoginController(LoginView view) {
        this.view = view;
    }

  
    
    
    public void autenticar() throws SQLException {

        //Busca um usuário na view
        String usuario = view.getjTextFieldLogin().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Pessoa pessoaAutenticar = new Pessoa(usuario,senha);
        
        
        //Verifica se o atendente existe no banco de dados
        Connection conexao = new Conexao().getConnection();
        PessoaDAO pessoaDao = new PessoaDAO(conexao);
            
        boolean existe = pessoaDao.existePessoaPorLoginESenha(pessoaAutenticar);
        
        if(existe){
        MenuView telaDeMenu = new MenuView();
        telaDeMenu.setVisible(true);            
        } else{
        JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos!");
        }
       
        
        


    }
}
