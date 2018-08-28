/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numero;
    private int clave;
    private String dueno;
    private double saldo;
    public static int numCuenta;

    public Cuenta(int numero, int clave, String dueno, double saldo) {
        this.numero = numero;
        this.clave = clave;
        this.dueno = dueno;
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return numero;
    }

    public int getClave() {
        return clave;
    }

    public String getDueno() {
        return dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public boolean consignar(double valor){
        if (valor > 0) {
            this.saldo +=valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean retirar(double valor){
        if (valor > 0 && valor <= this.saldo) {
            this.saldo-=saldo;
            return true;
        }else{
            return false;
        }
    }
}
