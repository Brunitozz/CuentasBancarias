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
public abstract class Cuenta {
    protected long numero;
    protected String nombreCliente;
    protected double saldo;
    protected Date fechaApertura;

    public Cuenta(long numero, String nombreCliente, double saldo, Date fechaApertura) {
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
    }

    /* Cuenta(numero, nombreCliente, saldo, fechaApertura)
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the fechaApertura
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }

        
    public abstract boolean depositar(double monto);
    public abstract boolean retirar(double monto);
    public abstract boolean calcularIntereses(double porcentaje);
}
