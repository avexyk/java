/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author avexy
 */
public class Promedio {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double promedio, sumatoria = 0;
        int tamano = 10;
        double[] arreglo = new double[tamano];
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = in.nextInt();
        }
        System.out.println("El arreglo original es:");
        for (int i = 0; i < tamano; i++) {
            System.out.println(arreglo[i]);
        }
        for (int i = 0; i < tamano; i++) {
            sumatoria  += arreglo[i];
        }
        promedio = sumatoria/tamano;
        System.out.println("El promedio es: " + promedio);
    }
    
}
