/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosPoo;

/**
 *
 * @author usuario
 */
public class NumerosReales {
    // Atributo
    private double numero;
   
    // Constructor por defecto, con el atributo a cero.
    public NumerosReales() {
        this.numero = 0;
    }
    
    // Constructor parametrizado.
    public NumerosReales(double numero) {
        this.numero = numero;
    }

    // Métodos get y set.
    public double getNumReales() {
        return numero;
    }

    public void setNumReales(double numero) {
        this.numero = numero;
    }
    
    // Métodos
    // Sumar
    public void Sumar(double sumarNumero){
        numero = numero + sumarNumero;
    }
    
    // Restar
    public void Restar(double restarNumero){
        numero = numero - restarNumero;
    }
    
    // Multiplicar
    public void Multiplicar(double multiplicarNumero){
        numero = numero * multiplicarNumero;
        // MultiplicarNumero *= numero; 
        // Con esto realiza el mismo funcionamiento escribiendo menos código
    }
    
    // Dividir
    public void Dividir(double dividirNumero){
        if (dividirNumero == 0){
            System.out.println("Error, el número seleccionado no sirve.");
        } else{
            numero /= dividirNumero;
        }
    }    
}
