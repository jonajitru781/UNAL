
import Modelo.Carro;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer {
    private GraphicsContext lapiz;
    private Carro carro;
    private Image fondo;
    private Image gato;
    private Image nino;
    private int moverse;
    private int move;
    

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro=new Carro(10,250,30,20);
        this.fondo=new Image("Image/fondo.png");
        this.gato=new Image("Image/cats.gif");
        this.nino=new Image("Image/right0.png");
        this.moverse=0;
        this.move=0;
        
    }
    int ciclo;
    int posfondo=1024;
    int posXNino=1024;
    int puntaje=100;
    @Override
    public void handle(long now) {
        
        lapiz.clearRect(0,0,300,300);
        
        lapiz.strokeRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
        lapiz.drawImage(this.fondo, this.posfondo-1024, 0);
        lapiz.drawImage(this.fondo, this.posfondo, 0);
        lapiz.strokeRect(20,360,100,60);
        lapiz.drawImage(gato, moverse, 0, 132, 80, 0, 340, 132, 80); // Origen y destino del 3 gato
        
        lapiz.drawImage(nino,this.posXNino,340,30, 80);
        lapiz.strokeRect(this.posXNino,340,30,80);
        if (this.posfondo<=0) {
            this.posfondo=1024;
        }else{
            this.posfondo--;
        }
        if (moverse<794 ) {
            this.moverse=this.moverse+132;
        }else if (moverse>794) {
            this.moverse=0;
        }
        if (move<794 ) {
            this.move=this.move+20;
        }else if (move>660) {
            this.move=0;
        }
        this.posXNino=this.posXNino-30;
        
        Shape rRectangulo1= new Rectangle(this.posXNino,340,30,80);
        Shape rRectangulo2 = new Rectangle(20,360,100,60);
        Shape interseccion= SVGPath.intersect(rRectangulo2, rRectangulo1);
        
        if(interseccion.getBoundsInLocal().getWidth()!=-1){
            this.puntaje=this.puntaje+10;
        }
          
        /*this.carro.mover();
        if (this.carro.getXref()==300) {
            carro.setXref(0);
            
        }*/
/*        
        lapiz.strokeRect(10, 250, 30, 20);
        lapiz.strokeOval(10, 270, 10, 10);
        lapiz.strokeOval(30, 270, 10, 10);
        lapiz.strokeRect(220, 250, 10, 30);
        lapiz.strokeRect(210, 220, 30, 30);
 
        
        lapiz.setFill(Color.RED);
        lapiz.fillOval(220, 220, 10, 10);
        lapiz.setFill(Color.YELLOW);
        lapiz.fillOval(220, 230, 10, 10);
        lapiz.setFill(Color.GREEN);
        lapiz.fillOval(220, 240, 10, 10);
*/
        
        lapiz.strokeText("Puntaje: "+puntaje, 200,30);
        
    }
    
}
