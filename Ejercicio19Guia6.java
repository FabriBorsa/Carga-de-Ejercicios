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
public class Ejercicio19Guia6 {

    /**
     * @param args the command line arguments
     */
//    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//    matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//    signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int tam = 0;
       boolean teste=false;
     
       System.out.println("Ingrese el tamaño de la matriz");
        tam = leer.nextInt();
        int mat[][]=new int[tam][tam];
        int m[][]=new int[tam][tam];
     
        System.out.println("Ingrese los elementos de la matriz");
        for (int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
                System.out.println("Fila "+(i+1)+"  Columna "+(j+1));
                mat[i][j]=leer.nextInt();
                m[i][j]=mat[i][j];
            }
        }
         
        for (int i=0; i < tam; i++) {
            for (int j=0; j < tam; j++) {
                mat[j][i] = mat[i][j];
            }
        }
     
        for (int i=0; i<tam; i++) {
            for (int j=0; j< tam; j++) {
                m[i][j] = -m[i][j];
            }
        }

        for (int i= 0; i <tam; i++){
            for (int j=0; j <tam; j++){
                if ( (mat[j][i]) == (m[i][j])){
                    teste = true;
                }
                else {
                    teste = false;
                }
            }
        }
        if (teste == true){
            System.out.println("La matriz es antisimétrica");
        }
        else {
            System.out.println("La matriz NO es antisimétrica"); 
            }
        
    }
}
