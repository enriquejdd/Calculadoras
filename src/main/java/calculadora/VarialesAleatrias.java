/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class VarialesAleatrias {
    public static void main(String[] args) {
        // Declaracion de un objeto llamdo variable de tipo Random
        Random var; //Apunta a null (Nada). No se puede usar.
        
        // Instanciació del objeto o creacion del objeto. (constructor)
        var = new Random();  //Ahora el atributo var no esta vacio ya que se guarda el sitio al haber credo el New

        // Variable aleatoria de tipo booleano
        boolean tf = var.nextBoolean();
        
        System.out.println(tf);
        
        // Variable aleatoria de tipo int
        // El rango es MIN_INT, MAX_INT
        System.out.println("Variable comprendidda entre "+ Integer.MIN_VALUE + " y " + Integer.MAX_VALUE);
        
        int enteroAleatorio = var.nextInt();
        System.out.println("Entero aleatorio: " + enteroAleatorio);
        
        // Generació de número entre 0 y 100
        int ceroCien = var.nextInt(100);
        System.out.println("Entre cero y cien " + ceroCien);
        
        int ceroCinco = var.nextInt(5);
        System.out.println("Entre cero y cinco " + ceroCinco);
        
        // Numero entre 1 y otro, hay que sumar 1 al resultado de nextInt()
        int unoDiez = var.nextInt(10) + 1;
        
        // Número entre 8 y 16
        int ochoDieciseis =  var.nextInt(16-8+1) + 8;
        System.out.println("Entre 8 y 16 " + ochoDieciseis);
        
    }
    
}
