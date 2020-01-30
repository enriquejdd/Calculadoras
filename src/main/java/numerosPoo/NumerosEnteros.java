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
public class NumerosEnteros {
     // Atributo
    private int numero;
   
    // Constructor por defecto, con el atributo a cero.
    public NumerosEnteros() {
        this.numero = 0;
    }
    
    // Constructor parametrizado.
    public NumerosEnteros(int numero) {
        this.numero = numero;
    }

    // Métodos get y set.
    public int getNumReales() {
        return numero;
    }

    public void setNumReales(int numero) {
        this.numero = numero;
    }
    
    // Métodos
    // Sumar
    public void Sumar(int sumarNumero){
        numero = numero + sumarNumero;
    }
    
    // Restar
    public void Restar(int restarNumero){
        numero = numero - restarNumero;
    }
    
    // Multiplicar
    public void Multiplicar(int multiplicarNumero){
        numero = numero * multiplicarNumero;
        // MultiplicarNumero *= numero; 
        // Con esto realiza el mismo funcionamiento escribiendo menos código
    }
    
    // Dividir
    public void Dividir(int dividirNumero){
        if (dividirNumero == 0){
            System.out.println("Error, el número seleccionado no sirve.");
        } else{
            numero /= dividirNumero;
        }
    }    
}
