/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero=lectura.nextInt();
        System.out.println("Ingrese la clave");
        int clave=lectura.nextInt();
        System.out.println("Ingrese el nombre del propietario");
        String dueno=lectura.next();
        System.out.println("Ingrese el saldo que tiene la cuenta");
        double saldo=lectura.nextDouble();
        Cuenta c1 =new Cuenta(numero,clave,dueno,saldo);
        System.out.println("Cuanto es el valor a consignar");
        double valor=lectura.nextDouble();
        c1.consignar(valor);
    }
}
