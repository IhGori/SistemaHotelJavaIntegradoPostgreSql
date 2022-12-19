

package model.departamento;


public class Departamento {
    
    private int id_dept;
    private String nome_dept;

    public Departamento(int id_dept, String nome_dept) {
        this.id_dept = id_dept;
        this.nome_dept = nome_dept;
    }

    public int getId_dept() {
        return id_dept;
    }

    public void setId_dept(int id_dept) {
        this.id_dept = id_dept;
    }

    public String getNome_dept() {
        return nome_dept;
    }

    public void setNome_dept(String nome_dept) {
        this.nome_dept = nome_dept;
    }
    
      @Override
    public String toString(){
        return getNome_dept();
    }
}
