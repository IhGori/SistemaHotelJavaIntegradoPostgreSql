

package model.informacao;

import java.util.Date;
import model.Pessoa;


public class Endereco extends Pessoa{
    private String logradouro;
    private String numero_residencia;
    private String bairro;
    private String cep;
    private String municipio;
    private String estado;

    public Endereco(String logradouro, String numero_residencia, String bairro, String cep, String municipio, String estado, String cpf, String nome_completo, String sexo, Date data_de_nascimento, String email, String usuario, String senha) {
        super(cpf, nome_completo, sexo, data_de_nascimento, email, usuario, senha);
        this.logradouro = logradouro;
        this.numero_residencia = numero_residencia;
        this.bairro = bairro;
        this.cep = cep;
        this.municipio = municipio;
        this.estado = estado;
    }

    public Endereco(String logradouro, String numero_residencia, String bairro, String cep, String municipio, String estado, String cpf) {
        super(cpf);
        this.logradouro = logradouro;
        this.numero_residencia = numero_residencia;
        this.bairro = bairro;
        this.cep = cep;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero_residencia() {
        return numero_residencia;
    }

    public void setNumero_residencia(String numero_residencia) {
        this.numero_residencia = numero_residencia;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
   
    
    
    

    

   

    

}
