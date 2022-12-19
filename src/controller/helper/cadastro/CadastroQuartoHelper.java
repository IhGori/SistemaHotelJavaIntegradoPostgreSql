

package controller.helper.cadastro;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.quarto.Quarto;
import view.cadastro.CadastroQuarto_novoView;


public class CadastroQuartoHelper {
private final CadastroQuarto_novoView view;

    public CadastroQuartoHelper(CadastroQuarto_novoView view) {
        this.view = view;
    }
    
    public Quarto obterModelo() {
         //Capturando das telas os dados escritos no text
         
     int id_quarto = Integer.parseInt(view.getjTextFieldId().getText());
     String tipo_quarto = view.getjTextFieldTipo_quarto().getText();
     double preco = Double.parseDouble(view.getjTextFieldPreco().getText());
   
     
     
     //et = dataAdmissão
    
     
     Quarto quartoI = new Quarto(id_quarto,tipo_quarto,preco);
     
     return quartoI;
    }
    
    
    
    
    public void preencherTabelaQuarto(ArrayList<Quarto> quartos) {
          //Agora com tableModel tem acesso ao conteudo da tabela
       DefaultTableModel tableModel =  (DefaultTableModel) view.getjTableQuartos().getModel();
       tableModel.setNumRows(0);
      
       //Percorrer a lista preenchendo a tableModel
       //fazendo um for it
        for (Quarto quarto : quartos){
           
           tableModel.addRow(new Object[]{
               quarto.getId_quarto(),
               quarto.getTipo_quarto(),
               quarto.getPreco()
               
               
           });
                   
       }
    }

    
    

    public void limptarTela() {
      
        view.getjTextFieldId().setText("");
        view.getjTextFieldPreco().setText("");
        view.getjTextFieldTipo_quarto().setText("");
    }

}
