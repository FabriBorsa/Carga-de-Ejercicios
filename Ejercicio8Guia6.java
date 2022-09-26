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
public class Ejercicio8Guia6 {

    /**
     * @param args the command line arguments
     */
//    Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//    Nota: investigar la función Lenght() en Java.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        //frase="";
        System.out.println("Ingrese una frase o palabra de no mas de 8 digitos");
        frase = leer.nextLine();    
        int length = frase.length();
        if(length <=8){
            System.out.println("CORRECTO");
        }else
            System.out.println("INCORRECTO");
        
    }
    
}
