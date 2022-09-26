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
public class Ejercicio20Guia6 {

    /**
     * @param args the command line arguments
     */
//    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//    El programa deberá comprobar que los números introducidos son correctos, es decir,
//    están entre el 1 y el 9
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sumaF=0,sumaC=0,sumaD1=0,sumaD2=0,j,sumaC2=0,sumaC3=0, conta=0;
        int[][] cm = new int[3][3];
        System.out.println("Ingreso 9 numeros entre el 1 y el 9"); 
        
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                cm[i][k]=leer.nextInt();
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sumaF+=cm[i][j];  
            }
            if(sumaF!=15){
                break;
            }else{conta++;}
            sumaF=0;
            sumaC3+=cm[i][2];
            sumaC2+=cm[i][1];
            sumaC+=cm[i][0];
            sumaD1+=cm[i][i];
            sumaD2+=cm[i][j-1];  
        }
        if(conta==3 && (sumaC3+sumaC2+sumaC+sumaD1+sumaD2)%15==0){
            System.out.println("SI");
        }else{
             System.out.println("NO");
        }
    }
}

