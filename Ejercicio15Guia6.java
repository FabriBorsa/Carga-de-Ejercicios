/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.java;

/**
 *
 * @author A134192
 */
public class Ejercicio15Guia6 {

    /**
     * @param args the command line arguments
     */
//    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//    muestre por pantalla en orden descendente.
    public static void main(String[] args) {
        int[] vector = new int[101];
        
        for (int i = 1; i < 101; i++) {
            vector[i]=i;
            
        }
        for (int i = 100; i >=1; i--) {
            System.out.print("(" + vector[i]+")");
        }
        System.out.println("");
    }
    
}
