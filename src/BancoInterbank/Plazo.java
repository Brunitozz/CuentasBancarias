/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoInterbank;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author user
 */
public class Plazo extends Cuenta {
    private int periodosMeses;
    private Date fechaVencimiento;
    Date fechaHoy = new Date();
    Plazo cuenta1 = new Plazo(numero, nombreCliente, saldo, fechaApertura);
    public Plazo(long numero, String nombreCliente, double saldo, Date fechaApertura) {
        super(numero, nombreCliente, saldo, fechaApertura);
        periodosMeses = 6;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaApertura); 
        calendar.add(Calendar.MONTH, periodosMeses); 
        fechaVencimiento = calendar.getTime(); 
    }
    

    @Override
    public boolean depositar(double monto) {
        if (fechaHoy.compareTo(fechaVencimiento) >= 0) {
            ((Plazo) cuenta1).setSaldo(((Plazo)cuenta1).getSaldo()+monto);
            //ColocarSaldo(ObtenerSaldo() + monto);
            return true;
        } else {
            return false;
        }
    }

    @Override //sobreescritura
    public boolean retirar(double monto) {
        if (fechaHoy.compareTo(fechaVencimiento) >= 0) {
            if(monto<=((Plazo) cuenta1).getSaldo()){
                ((Plazo) cuenta1).setSaldo(((Plazo)cuenta1).getSaldo()+monto);
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean calcularIntereses(double porcentaje) {
        double intereses;
        if(fechaHoy.compareTo(fechaVencimiento) >= 0){
            intereses = ((Plazo)cuenta1).getSaldo()*porcentaje;
            ((Plazo)cuenta1).setSaldo(((Plazo)cuenta1).getSaldo()+intereses);
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the periodosMeses
     */
    public int getPeriodosMeses() {
        return periodosMeses;
    }

    /**
     * @param periodosMeses the periodosMeses to set
     */
    public void setPeriodosMeses(int periodosMeses) {
        this.periodosMeses = periodosMeses;
    }

    /**
     * @return the fechaVencimiento
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
