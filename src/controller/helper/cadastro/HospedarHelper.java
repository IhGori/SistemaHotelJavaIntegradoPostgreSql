

package controller.helper.cadastro;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Hospede;
import model.Pessoa;
import model.quarto.Quarto;
import model.reserva.Hospedar;
import view.cadastro.ReservaView;


public class HospedarHelper {
 private final ReservaView view;

    public HospedarHelper(ReservaView view) {
        this.view = view;
    }

    
     public void preencherTabela(ArrayList<Hospedar> hosperdars) {
        
       //Agora com tableModel tem acesso ao conteudo da tabela
       DefaultTableModel tableModel =  (DefaultTableModel) view.getjTableReserva().getModel();
       tableModel.setNumRows(0);
      
       //Percorrer a lista preenchendo a tableModel
       //fazendo um for it
       
       for (Hospedar hospedar : hosperdars){
           
           tableModel.addRow(new Object[]{
               hospedar.getId_reserva(),
               hospedar.getHora_reserva(),
               hospedar.getData_check_in(),
               hospedar.getData_check_out(),
               hospedar.getValor_total(),
               hospedar.getObservacao(),
               hospedar.getId_hospede(),
               hospedar.getId_quarto()            
               
               
           });
                   
       }
    }
    
    public void preencherReservas(ArrayList<Quarto> quartos) {
   
        DefaultComboBoxModel comboBoxModelReserva = (DefaultComboBoxModel) view.getjComboBoxQuarto().getModel();
        
        for(Quarto quarto : quartos){
            //Retorna um objeto para poder assim manipular
            //Se tiversse colocado o elemento especifico não consegue tratar para outros campos
            comboBoxModelReserva.addElement(quarto);
            
        }

    }
        
       public Quarto obterPreco() {
        return (Quarto) view.getjComboBoxQuarto().getSelectedItem();
    }
    
       public void setarPreco(double preco) {
        view.getjTextFieldValor().setText(preco+"");
        
        
    }
      
       
         public Quarto obterId_quarto() {
        return (Quarto) view.getjComboBoxQuarto().getSelectedItem();
    }
    
       public void setarId_quarto(int id_quarto) {
        view.getjTextFieldIdQuarto().setText(id_quarto+"");
        
        
    }
       
  
      
      public void preencherNomes(ArrayList<Pessoa> pessoas) {
   
        DefaultComboBoxModel comboBoxModelPessoa = (DefaultComboBoxModel) view.getjComboBoxHospede().getModel();
        
        for(Pessoa pessoa : pessoas){
            //Retorna um objeto para poder assim manipular
            //Se tiversse colocado o elemento especifico não consegue tratar para outros campos
            comboBoxModelPessoa.addElement(pessoa);
            
        }

    } 
       
       
        public Hospede obterId_hospede() {
        return (Quarto) view.getjComboBoxHospede().getSelectedItem();
    }
    
       public void setarId_hospede(int id_hospede) {
        view.getjTextFieldNomeHospede1().setText(id_hospede+"");
        
        
    }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    

    public Hospedar obterModelo() {

        //Captura os dados do text do ReservaView
        
        
        int id_reserva = Integer.parseInt(view.getjTextFieldIdReserva().getText());
        String hora_reserva = view.getjTextFieldHora().getText();
        java.util.Date d = new java.util.Date(view.getjTextFieldDataCheckIn().getText());
        java.sql.Date dt = new java.sql.Date(d.getTime());
        java.util.Date e = new java.util.Date(view.getjTextFieldDataCheckOut().getText());
        java.sql.Date et = new java.sql.Date(d.getTime());
        Double valor_total = Double.parseDouble(view.getjComboBoxQuarto().getSelectedItem().toString());
        String observacao = view.getjTextArea1().getText();
        int id_hospede = Integer.parseInt(view.getjTextFieldNomeHospede1().getText());
        int id_quarto = Integer.parseInt(view.getjTextFieldIdQuarto().getText());
        
        
        
        
        
        Hospedar hospedarI = new Hospedar(id_reserva, hora_reserva, dt, et, valor_total, observacao, id_hospede, id_quarto);
        return hospedarI;
        }   

    public void limptarTela() {
        
        view.getjTextArea1().setText("");
        view.getjTextFieldDataCheckIn().setText("");
        view.getjTextFieldDataCheckOut().setText("");
        view.getjTextFieldHora().setText("");
        view.getjTextFieldIdQuarto().setText("");
        view.getjTextFieldIdReserva().setText("");
        view.getjTextFieldNomeHospede1().setText("");
        view.getjTextFieldValor().setText("");
    }

    
}
