

package model.reserva;

import java.util.Date;
import model.quarto.Quarto;


public class Hospedar extends Quarto{
    
    private int id_reserva;
    private String hora_reserva;
    private Date data_check_in;
    private Date data_check_out;
    private double valor_total;
    private String observacao;

    public Hospedar(int id_reserva, String hora_reserva, Date data_check_in, Date data_check_out, double valor_total, String observacao, int id_quarto, int id_hospede) {
        super(id_quarto, id_hospede);
        this.id_reserva = id_reserva;
        this.hora_reserva = hora_reserva;
        this.data_check_in = data_check_in;
        this.data_check_out = data_check_out;
        this.valor_total = valor_total;
        this.observacao = observacao;
    }

   
   

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getHora_reserva() {
        return hora_reserva;
    }

    public void setHora_reserva(String hora_reserva) {
        this.hora_reserva = hora_reserva;
    }

    public Date getData_check_in() {
        return data_check_in;
    }

    public void setData_check_in(Date data_check_in) {
        this.data_check_in = data_check_in;
    }

    public Date getData_check_out() {
        return data_check_out;
    }

    public void setData_check_out(Date data_check_out) {
        this.data_check_out = data_check_out;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    

}
