

package controller.helper.cadastro;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Func;
import model.Pessoa;
import model.departamento.Departamento;
import model.informacao.Endereco;
import model.informacao.Telefone;
import view.cadastro.CadastroFuncView;
import view.cadastro.CadastroPessoaView;


public class CadastroFuncHelper {

    private final CadastroFuncView view;

    public CadastroFuncHelper(CadastroFuncView view) {
        this.view = view;
    }
    


   
    
    
    
    
    
    
    
    
    
    
   
    public Func obterModelo() {
         //Capturando das telas os dados escritos no text
         
     
     int matricula = Integer.parseInt(view.getjTextFieldMatricula().getText());
     String pis = view.getjTextFieldPis().getText();
     String cnh = view.getjTextFieldCNH().getText();
     String cpf = view.getjComboBoxCpf().getSelectedItem().toString();
     java.util.Date d = new java.util.Date(view.getjTextFieldData_de_admissao().getText());
     java.sql.Date dt = new java.sql.Date(d.getTime());
     int id_dept = Integer.parseInt(view.getjTextFieldId_dept().getText());
     String cargo = view.getjComboBoxDepartamento().getSelectedItem().toString();
     

     
     
     //et = dataAdmissão
    
     
     Func funcI = new Func(matricula,pis,cnh,cpf,dt,id_dept,cargo);
     
     return funcI;
    }

    
    
    
    
    

    public void limptarTela() {
        view.getjTextFieldCNH().setText("");
        view.getjTextFieldData_de_admissao().setText("");
        view.getjTextFieldId_dept().setText("");
        view.getjTextFieldMatricula().setText("");
        view.getjTextFieldNome().setText("");
        view.getjTextFieldPis().setText("");
    }

    public void preencherNome(ArrayList<Pessoa> pessoas) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCpf().getModel();
        
        for (Pessoa pessoa : pessoas){
            comboBoxModel.addElement(pessoa); //Aqui que faz ser inserido o elemento
        }
    }

    public void preencherDepartamento(ArrayList<Departamento> departamentos) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxDepartamento().getModel();
        
        for (Departamento departamento : departamentos){
            comboBoxModel.addElement(departamento); //Aqui que faz ser inserido o elemento
        }
    }

    public Pessoa obterNome() {
        return (Pessoa) view.getjComboBoxCpf().getSelectedItem();
    }
    
    public void setarValor(String cpf) {
        view.getjTextFieldNome().setText(cpf);
        
    }

    public Departamento obterId_dept() {
        return (Departamento) view.getjComboBoxDepartamento().getSelectedItem();
    }
    
    public void setarValor2(int id_dept) {
        view.getjTextFieldId_dept().setText(id_dept+"");
      
        
    }
}


 