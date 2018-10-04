/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int Xref,Yref,ancho,alto;
    private Chasis chasis;
    private Llanta[] llantas;
    
    public int getXref() {
        return Xref;
    }

    public void setXref(int Xref) {
        this.Xref = Xref;
    }

    public int getYref() {
        return Yref;
    }

    public void setYref(int Yref) {
        this.Yref = Yref;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Carro(int Xref, int Yref, int ancho, int alto) {
        this.Xref = Xref;
        this.Yref = Yref;
        this.ancho = ancho;
        this.alto = alto;
        
    }
    
    public void mover(){
        this.Xref++;
    }
}
