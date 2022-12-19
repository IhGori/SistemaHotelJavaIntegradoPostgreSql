

package model;

import java.util.Date;


public class Hospede extends Pessoa{
    private int id_hospede;

    public Hospede(int id_hospede, String cpf, String nome_completo, String sexo, Date data_de_nascimento, String email, String usuario, String senha) {
        super(cpf, nome_completo, sexo, data_de_nascimento, email, usuario, senha);
        this.id_hospede = id_hospede;
    }

    public Hospede(int id_hospede) {
        this.id_hospede = id_hospede;
    }

    
    public Hospede(int id_hospede, String cpf) {
        super(cpf);
        this.id_hospede = id_hospede;
    }

    public Hospede(int id_hospede, String cpf, String nome_completo, String email) {
        super(cpf, nome_completo, email);
        this.id_hospede = id_hospede;
    }

    
    
    public Hospede() {
    }

    public Hospede(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getId_hospede() {
        return id_hospede;
    }

    public void setId_hospede(int id_hospede) {
        this.id_hospede = id_hospede;
    }
    
    
     @Override
    public String toString(){
        return getCpf();
    }
    

  
  
    
}
