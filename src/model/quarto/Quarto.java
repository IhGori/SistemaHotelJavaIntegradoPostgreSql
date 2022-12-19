

package model.quarto;

import model.Hospede;


public class Quarto extends Hospede{
    private int id_quarto;
    private String tipo_quarto;
    private double preco;

   

    public Quarto(int id_quarto, String tipo_quarto, double preco) {
        this.id_quarto = id_quarto;
        this.tipo_quarto = tipo_quarto;
        this.preco = preco;
    }

    public Quarto(int id_quarto, String tipo_quarto, double preco, int id_hospede) {
        super(id_hospede);
        this.id_quarto = id_quarto;
        this.tipo_quarto = tipo_quarto;
        this.preco = preco;
    }

    public Quarto(int id_quarto, String tipo_quarto) {
        this.id_quarto = id_quarto;
        this.tipo_quarto = tipo_quarto;
    }

    public Quarto(int id_quarto, int id_hospede) {
        super(id_hospede);
        this.id_quarto = id_quarto;
    }

      
    
    public int getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    public String getTipo_quarto() {
        return tipo_quarto;
    }

    public void setTipo_quarto(String tipo_quarto) {
        this.tipo_quarto = tipo_quarto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

 @Override
    public String toString(){
        return getTipo_quarto();
    }
    

  
}
