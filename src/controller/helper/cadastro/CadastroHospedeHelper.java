

package controller.helper.cadastro;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Hospede;
import model.Pessoa;
import view.cadastro.CadastroHospede_NovoView;


public class CadastroHospedeHelper {
    private final CadastroHospede_NovoView view;

    public CadastroHospedeHelper(CadastroHospede_NovoView view) {
        this.view = view;
    }
     
    
    
    
   
    public Hospede obterModelo() {
         //Capturando das telas os dados escritos no text
     int id_hospede = Integer.parseInt(view.getjTextFieldId_hospede().getText());
     String cpf = view.getjTextFieldNome().getText();
     
     
     
  
     
     //et = dataAdmissão
    
     
     Hospede hospedeI = new Hospede(id_hospede,cpf);
     
     return hospedeI;
    }

    
    
    
    
    

    public void limptarTela() {
        view.getjTextFieldId_hospede().setText("");
        view.getjTextFieldNome().setText("");
      
    }

public void preencherCpf(ArrayList<Pessoa> pessoas) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCpf().getModel();
        
        for (Pessoa pessoa : pessoas){
            comboBoxModel.addElement(pessoa); //Aqui que faz ser inserido o elemento
        }
    }


    public Pessoa obterNome() {
        return (Pessoa) view.getjComboBoxCpf().getSelectedItem();
    }
    
    public void setarValor(String cpf) {
        view.getjTextFieldNome().setText(cpf);
        
    }

        
    
}
