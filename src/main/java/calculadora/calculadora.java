/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**Menu calculadora
 *Sumar
 *Multipplicarint
 * Dividir
 * Potencia - Math power(a,b)
 * Salir
 * 
 * escribe opción: 1
 * intr oper 1: 7
 * intr oper 2: 3
 * resultado es: 70
 */
public class calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = true; //Para poder salir o al darle al 5
    do{ //bucle para cuando se haga una operación solicite un nueo numero para la siguiente.
        
      
        System.out.println("");        
        System.out.println("Menu Calculadora");
        System.out.println("1 - Sumar");
        System.out.println("2 - Multiplicar");
        System.out.println("3 - Dividir");
        System.out.println("4 - Potencia");
        System.out.println("5 - Salir");
        System.out.println("");
        System.out.print("Introduzca la opción deseada: ");
        int opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Eligió la opción de Sumar");
                System.out.print("Escriba su número: ");
                int Suma1 = teclado.nextInt();
                
                System.out.print("Ecriba el segundo número: ");
                int Suma2 = teclado.nextInt();
                
                int Suma = Suma1 + Suma2;
                
                System.out.println("El resultado de la suma de " + Suma1 + " y " + Suma2 + " es " + Suma);
                break;
            
            case 2:
                System.out.println("Elegió la opción de Multiplicar");
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
                
                if(Div2 == 0){
                    System.out.print("Escriba otro número "); 
                    double Div3 = teclado.nextDouble();
                    
                    double Div = Div1 / Div3;
                    System.out.println("El resultado de la división entre " + Div1 + " y " + Div3  + " es " + Div);
                    break;
                
                } else{
                    double Div = Div1 / Div2;
                    System.out.println("El resultado de la división entre " + Div1 + " y " + Div2  + " es " + Div);
                    break;                
                }
             
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
                teclado.nextLine(); //Limpiar el buffer (permite escribir de nuevo)
                System.out.println("Eligió la opción de Salir");
                System.out.println("¿Esta seguro de esta opción?");
                String quedar = teclado.nextLine();
                    if("No".equalsIgnoreCase(quedar)){ //Sirve para que tenga que estar eseo concretamente escrito
                        salir = true;
                    } else {
                        salir = false;
                        System.out.println("Ha salido correctamente");
                        System.out.println("");
                    }
                break;
                        
        } 
    }while (salir); //segunda opción del bucle en la cual salimos de la operación
    
}
}
