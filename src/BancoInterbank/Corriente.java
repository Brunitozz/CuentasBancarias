/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoInterbank;
import java.util.Date;
/**
 *
 * @author user
 */
public class Corriente extends Cuenta {
    private double sobregiro;
    /*Corriente corriente1 = new Corriente(numero, nombreCliente, saldo, fechaApertura);*/
    public Corriente(long numero, String nombreCliente, double saldo, Date fechaApertura) {
        super(numero, nombreCliente, saldo, fechaApertura);
        sobregiro = this.getSaldo()*2;
    }

    public Corriente(double sobregiro, long numero, String nombreCliente, double saldo, Date fechaApertura) {
        super(numero, nombreCliente, saldo, fechaApertura);
        this.sobregiro = sobregiro;
    }
   
    @Override
    public boolean depositar(double monto) {
        this.setSaldo(this.getSaldo()+monto);
        return true;
    }

    @Override
    public boolean retirar(double monto) {
        if(monto <= this.getSaldo()+sobregiro){
                if(monto<=this.getSaldo()){
                    this.setSaldo(this.getSaldo() - monto);
                    return true;
                }else{
                    sobregiro = sobregiro + this.getSaldo()-monto;
                    this.setSaldo(0);
                }
                return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean calcularIntereses(double porcentaje) {
        double intereses;
        intereses = this.getSaldo()*porcentaje;
        this.setSaldo(this.getSaldo()+intereses);
        return true;
    }
    
    public boolean calcularMantenimiento(double porcentaje){
        double mantenimiento;
        mantenimiento=this.getSaldo()*porcentaje;
        this.setSaldo(this.getSaldo()-mantenimiento);
        return true;
    }
    /**
     * @return the sobregiro
     */
    public double getSobregiro() {
        return sobregiro;
    }

    /**
     * @param sobregiro the sobregiro to set
     */
    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }
    
}
