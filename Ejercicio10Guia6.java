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
public class Ejercicio10Guia6 {

    /**
     * @param args the command line arguments
     */
    //Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num,num1, suma;
        suma=0;
        System.out.println("Ingrese un valor limite positivo");
        num = leer.nextInt();
        do{
            System.out.println("Ingrese un numero");
            num1=leer.nextInt();
            suma= suma + num1;
            
        }while(suma<=num);
    }
    
}
