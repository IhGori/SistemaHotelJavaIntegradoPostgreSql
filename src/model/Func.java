

package model;

import java.util.Date;


public class Func extends Pessoa{
    private int matricula;
    private String pis;
    private String cnh;
    private Date data_de_admissao;
    private int id_dept;
    private String cargo;

    public Func(int matricula, String pis, String cnh, String cpf, Date data_de_admissao, int id_dept, String cargo) {
        super(cpf);
        this.matricula = matricula;
        this.pis = pis;
        this.cnh = cnh;
        this.data_de_admissao = data_de_admissao;
        this.id_dept = id_dept;
        this.cargo = cargo;
    }

    public Func(String usuario, String senha) {
        super(usuario, senha);
    }

    
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Date getData_de_admissao() {
        return data_de_admissao;
    }

    public void setData_de_admissao(Date data_de_admissao) {
        this.data_de_admissao = data_de_admissao;
    }

    public int getId_dept() {
        return id_dept;
    }

    public void setId_dept(int id_dept) {
        this.id_dept = id_dept;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
