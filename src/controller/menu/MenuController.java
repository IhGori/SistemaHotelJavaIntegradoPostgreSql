

package controller.menu;

import java.sql.SQLException;
import view.cadastro.ReservaView;
import view.menu.MenuView;


public class MenuController {
    private final MenuView view;

    //Para criar um menu principal precisa passar um menu do tipo view, a partir disso 
    //consegue ter acesso a view no codigo abaixo
    public MenuController(MenuView view) {
        this.view = view;
    }
    
    public void navegarParaReserva() throws SQLException{
        
      /* CadastroHospedeView reserva = new CadastroHospedeView();
       
       reserva.setVisible(true);*/
      ReservaView telaDeReserva = new ReservaView();
      telaDeReserva.setVisible(true);
        
    }
    
    
}
