
package controller.update;

import dao.Conexao;
import dao.HospedeDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Hospede;
import view.update.DeletarHospedeView;


public class DeletarHospedeController {
    
    private DeletarHospedeView view;

    public DeletarHospedeController(DeletarHospedeView view) {
        this.view = view;
    }

  public void deletaHospede() throws SQLException{
      
         int id = Integer.parseInt(view.getjTextFieldIdDeletar().getText());
         Hospede hospedeg = new Hospede(id);  
      
        Connection conexao = new Conexao().getConnection();
        HospedeDAO hospedeDao = new HospedeDAO(conexao);
        hospedeDao.deleteHospede(hospedeg);
        
        JOptionPane.showMessageDialog(view, "Hóspede deletado com sucesso!");
        
        
      
  }
    
    
    
}
