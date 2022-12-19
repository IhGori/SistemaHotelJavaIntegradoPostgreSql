

package model;

import java.util.Date;


public class Pessoa {
    private String cpf;
    private String nome_completo;
    private String sexo;
    private Date data_de_nascimento;
    private String email;
    private String usuario;
    private String senha;
    
    private int id_pesquisa;

    public Pessoa(String cpf, String nome_completo, String sexo, Date data_de_nascimento, String email, String usuario, String senha) {
        this.cpf = cpf;
        this.nome_completo = nome_completo;
        this.sexo = sexo;
        this.data_de_nascimento = data_de_nascimento;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Pessoa(String cpf, String nome_completo,int id_pesquisa) {
       this.cpf = cpf;
       this.nome_completo = nome_completo;
       this.id_pesquisa = id_pesquisa;
    }

    public Pessoa(String cpf, String nome_completo, String email) {
        this.cpf = cpf;
        this.nome_completo = nome_completo;
        this.email = email;
    }
    
    

    public Pessoa(String usuario, String senha) {
     this.usuario = usuario;
     this.senha = senha;
    }

 
   
    public Pessoa() {
    }

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public int getId_pesquisa() {
        return id_pesquisa;
    }

    public void setId_pesquisa(int id_pesquisa) {
        this.id_pesquisa = id_pesquisa;
    }

    
    
    
   

    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(Date data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public String toString(){
        return getNome_completo();
    }
    
   
    
    
    
    
}

