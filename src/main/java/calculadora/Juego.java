/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Scanner;

import java.util.Random;

/**
 * boolean repetir = true;
 *
 * @author usuario
 */
public class Juego {

    /* public static void caraCruz(Random random, Scanner teclado){
        System.out.println("Cara o Cruz");
                
            if(random.nextInt(2) == teclado.nextInt()){
                System.out.println("Has // boolean repetir = true;ganado");
            } else {
                System.out.println("Has perdido");
            }*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = true;
        Random var = new Random();

        do {

            System.out.println("1- Cara o cruz"); // Ganar, perder, empatar
            System.out.println("2- Piedra/Papel/Tjera");
            System.out.println("3- Tragaperras"); // no iguales 0. 2 iguales 50, 3 iguales 100
            System.out.println("4- Trageperras automática");
            System.out.println("5- Adivina el número en 1 y 20");
            System.out.println("6- Salir");
            System.out.println("");
            System.out.print("Introduzca la opción deseada: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    /* caraCruz(random, teclado); */
                    System.out.println("Eligió Cara o Cruz");
                    System.out.println("Escriba 0 para Cara y 1 para Cruz");
                    int caraCruz = var.nextInt(1);

                    if (var.nextInt(2) == teclado.nextInt()) {
                        System.out.println("Has // boolean repetir = true;ganado");
                    } else {
                        System.out.println("Has perdido");
                    }
                    break;

                case 2:
                    System.out.println("Elegió la opción de Piedra/Papel/Tijeras");
                    System.out.print("Escriba su número: ");
                    int Mult1 = teclado.nextInt();

                    System.out.print("Escriba su segundo número: ");
                    int Mult2 = teclado.nextInt();

                    int Mult = Mult1 * Mult2;

                    System.out.println("El resultado de la multiplicación de " + Mult1 + " por " + Mult2 + " es " + Mult);
                    break;

                case 3:
                    System.out.println("Escribió la opción de Dividir");
                    System.out.print("Escriba su número: ");
                    double Div1 = teclado.nextDouble();

                    System.out.print("Escriba el segundo número: ");
                    double Div2 = teclado.nextDouble();
                    if (Div2 == 0) {
                        System.out.print("Escriba nuevamente su número ");
                    }

                    double Div = Div1 / Div2;

                    System.out.println("El resultado de la división entre " + Div1 + " y " + Div2 + " es " + Div);
                    break;

                case 4:
                    System.out.println("Escribió la opción de Potencia");
                    System.out.print("Escriba su número: ");
                    int Pot1 = teclado.nextInt();

                    System.out.print("Escriba el segundo número: ");
                    int Pot2 = teclado.nextInt();

                    int Pot = Pot1 / Pot2;

                    System.out.println("El resultado de la potenciación de " + Pot1 + " a " + Pot2 + " es " + Math.pow(Pot1, Pot2));
                    break;

                case 5:

                case 6:
                    teclado.nextLine();
                    System.out.println("Eligió la opción de Salir");
                    System.out.println("¿Esta seguro de esta opción?");
                    String elegir = teclado.nextLine();
                    if ("No".equalsIgnoreCase(elegir)) {
                        salir = true;
                    } else {
                        salir = false;
                        System.out.println("Has salido correctamente");
                        System.out.println("");
                    }
                    break;
            }
        } while (salir);
    }
}
