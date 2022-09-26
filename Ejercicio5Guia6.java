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
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
public class Ejercicio5Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,doble,triple;
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        System.out.println("El doble del numero: "+ num*2);
        System.out.println("El triple del numero: "+ num*3);
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(num));
    }
    
}
