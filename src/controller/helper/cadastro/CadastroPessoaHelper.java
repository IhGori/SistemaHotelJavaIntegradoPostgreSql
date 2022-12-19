

package controller.helper.cadastro;

import controller.helper.IHelper;
import model.Pessoa;

import model.informacao.Endereco;
import model.informacao.Telefone;
import view.cadastro.CadastroPessoaView;

public class CadastroPessoaHelper {
    
    private final CadastroPessoaView view;

    public CadastroPessoaHelper(CadastroPessoaView view) {
        this.view = view;
    }
    
    public Pessoa obterModelo() {
         //Capturando das telas os dados escritos no text
         
     String cpf = view.getjTextFieldCPF().getText();
     String nome_completo = view.getjTextFieldNome().getText();
     String sexo = view.getjTextFieldSexo().getText();
     java.util.Date d = new java.util.Date(view.getjTextFieldDataNascimento().getText());
     java.sql.Date dt = new java.sql.Date(d.getTime());
     String email = view.getjTextFieldEmail().getText();
     String usuario = view.getjTextFieldUsuario().getText();
     String senha = view.getjPasswordFieldSenha().getText();
     
     
     
     //et = dataAdmissão
    
     
     Pessoa pessoaI = new Pessoa(cpf, nome_completo, sexo, dt, email, usuario, senha);
     
     return pessoaI;
    }
    
    public Telefone obterModelo_Telefone(){
      
        int ddd = Integer.parseInt(view.getjTextFieldDDD().getText());
        String telefone = view.getjTextFieldNumero_telefone().getText();
        String cpf = view.getjTextFieldCPF().getText();
        
       
        
       Telefone telefoneI = new Telefone(ddd,telefone,cpf);
       return telefoneI;
    }
    
    
       public Endereco obterModelo_Endereco(){
      
                
       String logradouro  = view.getjTextFieldLogradouro().getText();
       String numero_residencia = view.getjTextFieldNumero_residencia().getText();
       String bairro = view.getjTextFieldBairro().getText();
       String cep = view.getjTextFieldCEP().getText();
       String municipio = view.getjTextFieldMunicipio().getText();
       String estado = view.getjTextFieldEstado().getText();
       String cpf = view.getjTextFieldCPF().getText();
       
        
       Endereco enderecoI = new Endereco(logradouro,numero_residencia,bairro,cep,municipio,estado,cpf);
       return enderecoI;
    }
    
    

    public void limptarTela() {
        view.getjTextFieldLogradouro().setText("");
        
        view.getjTextFieldDDD().setText("");
        view.getjTextFieldNumero_telefone().setText("");
        view.getjTextFieldNumero_residencia().setText("");
        view.getjPasswordFieldSenha().setText("");
        view.getjTextFieldCPF().setText("");
        view.getjTextFieldDataNascimento().setText("");
        view.getjTextFieldEmail().setText("");
        view.getjTextFieldNome().setText("");
        view.getjTextFieldSexo().setText("");
        view.getjTextFieldUsuario().setText("");
    }

}
