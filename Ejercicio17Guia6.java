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
public class Ejercicio17Guia6 {

    /**
     * @param args the command line arguments
     */
    
//    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//    de 2 dígitos, etcétera (hasta 5 dígitos).
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int unDigito,dosDigitos,tresDigitos,cuatroDigitos,cincoDigitos;
        unDigito=0;
        dosDigitos=0;
        tresDigitos=0;
        cuatroDigitos=0;
        cincoDigitos=0;
        System.out.println("Ingrese el tamaño del vector");
        int n= leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*10000)+1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+",");
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            String x = Integer.toString(vector[i]);
            //System.out.print(x.length());
            if(x.length()==1){
                unDigito++;
            }
            if(x.length()==2){
                dosDigitos++;
            }
            if(x.length()==3){
                tresDigitos++;
            }
            if(x.length()==4){
                cuatroDigitos=cuatroDigitos+1;
            }
            if(x.length()==5){
                cincoDigitos++;
            }
        }
        System.out.println("Numeros de un digito hay " + unDigito);
        System.out.println("Numeros de dos digitos hay "+ dosDigitos);
        System.out.println("Numeros de tres digitos hay "+ tresDigitos);
        System.out.println("Numeros de cuatro digitos hay "+ cuatroDigitos);
        System.out.println("Numeros de cinco digitos hay "+ cincoDigitos);
    }
    
}
