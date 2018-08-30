/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    private Libro[] coleccion;

    public ConjuntoLibros() {
        this.coleccion = new Libro[4];
    }
    
    public boolean anadirLibro(String titulo, String autor, int numPaginas, float calificacion){
        for(int i=0;i<this.coleccion.length;i++){
            if(this.coleccion[i]==null){
                Libro libro=new Libro(titulo, autor, numPaginas, calificacion);
                this.coleccion[i]=libro;
                return true;
            }
        }
        return false;   
    }
    
    public boolean eliminarXAutor(String autor){
        for(int i=0;i<this.coleccion.length;i++){
            if(this.coleccion[i].equals(autor)){
                this.coleccion[i]=null;
                return true;
            }
        }
        return false;    
    }
    
    public boolean eliminarXTitulo(String titulo){
        for(int i=0;i<this.coleccion.length;i++){
            if(this.coleccion[i].equals(titulo)){
                this.coleccion[i]=null;
                return true;
            }
        }
        return false;        
    }
    
    public Libro obtenerMejorCalificado(){
        Libro MC= new Libro("", "", 0, (float) 0);
        for(int i=0;i<this.coleccion.length;i++){    
            if(this.coleccion[i].getCalificacion()>MC.getCalificacion()){
                MC=coleccion[i];
            }
        }
        return null;
    }
    
    public Libro obtenerPeorCalificado(){
        return null;
    }
    
    public Libro[] obtenerTodosLibros(){
        return this.coleccion;
    }
}
