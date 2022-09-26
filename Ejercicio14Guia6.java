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
public class Ejercicio14Guia6 {

    /**
     * @param args the command line arguments
     */
    
//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String moneda;
        double convertir;
        convertir=0;
        System.out.println("Introducir la cantidad de euros");
        double cantidad = leer.nextDouble();
        //Tengo que poner la siguiente linea ya que debe borrar el scan ya que mas abajo voy a unar un string
        leer.nextLine();
        System.out.println("Introduzca la moneda a la que desea convertir");
        System.out.println("1-Libras");
        System.out.println("2-Pesos");
        System.out.println("3-Yenes");
        moneda = leer.next();
        
        switch (moneda){
            case "Libras":
                convertir= cantidad * 0.86;
                break;
            case "Pesos":
                convertir= cantidad * 1.28611;
                break;
            case "Yenes":
                convertir= cantidad * 129.852;
                break;
        }
        mostrarConvercion(moneda, convertir);
    }
    public static void mostrarConvercion (String moneda,double convertir){
        System.out.println("La convercion de euros a " + moneda + " es "+ convertir);
}
}

