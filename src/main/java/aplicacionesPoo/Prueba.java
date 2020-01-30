/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionesPoo;

import java.util.Random;
import java.util.Scanner;
// importacion de las clases NumerosEnteros y NumerosReales
//import numeros.NumerosEnteros;
//import numeros.NumerosReales;
import numerosPoo.*; // importa todos las clases de los paquetes que empiezen por numeros.

/**
 *
 * @author usuario
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
//        NumerosReales nR1 = new NumerosReales();
//        NumerosEnteros nE1 = new NumerosEnteros();
        
        System.out.println("Escriba un número real");
        double num1 = teclado.nextDouble();
        
        System.out.println("Escriba un número entero");
        int num2 = teclado.nextInt();
        
        NumerosReales nR1 = new NumerosReales(num1);
        NumerosEnteros nE1 = new NumerosEnteros(num2);
        
        double numAleatorioR1 = aleatorio.nextDouble();
        int numAleatorioE1 = aleatorio.nextInt(100)+1;
        
    }
}
