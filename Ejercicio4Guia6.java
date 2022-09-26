/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.java;

import java.util.Scanner;

/**
 *
 * @author A134192
 */
public class Ejercicio4Guia6 {

    /**
     * @param args the command line arguments
     */
//    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double gradoscenti, fahre;
        System.out.println("Ingrese la cantidad de grados centigrados");
        gradoscenti = leer.nextDouble();
        fahre = 32+(9* gradoscenti/5);
        System.out.println("Los grados Fahrenheit de los Grados Centigrados ingresados es: " + fahre );
    }
    
}
