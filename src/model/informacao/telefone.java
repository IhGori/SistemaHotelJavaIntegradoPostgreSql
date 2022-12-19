

package model.informacao;

import java.util.Date;
import model.Pessoa;


public class Telefone extends Pessoa {
    
    private int ddd;
    private String numero_telefone;

    public Telefone(int ddd, String numero_telefone, String cpf, String nome_completo, String sexo, Date data_de_nascimento, String email, String usuario, String senha) {
        super(cpf, nome_completo, sexo, data_de_nascimento, email, usuario, senha);
        this.ddd = ddd;
        this.numero_telefone = numero_telefone;
    }

    public Telefone(int ddd, String numero_telefone, String cpf) {
        super(cpf);
        this.ddd = ddd;
        this.numero_telefone = numero_telefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }

   
   
    }
    
    
