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
public class Ejercicio12Guia6 {

    /**
     * @param args the command line arguments
     */
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contadorincor,contadorcorr;
        contadorincor=-1;
        contadorcorr=0;
        do{
               
        System.out.println("Ingrese una cadena de 5 caracteres");
        cadena = leer.nextLine();
        
        if (cadena.substring(0,1).equals("x") && cadena.substring(4,5).equals("o")){
            System.out.println("Correcta" );
            contadorcorr=contadorcorr+1;
            System.out.println("");
        }else{
            System.out.println("Incorrecta ");
            contadorincor=contadorincor+1;
            System.out.println("");
        }
            
        }while(!cadena.equals("&&&&&") && (cadena.length()<=5));
        System.out.println("Cantidad correctas " + contadorcorr);
        System.out.println("Cantidad incorrectas " + contadorincor);
    }
    
}
