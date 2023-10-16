/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

/**
 *
 * @author Elizabeth Carrasco
 */
public class Calculadora1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculator c = new Calculator();

        double numero1 = 7.0;
        double numero2 = 5.0;

        double suma = c.add(numero1, numero2);
        double resta = c.subtract(numero1, numero2);
        double multiplicacion = c.multiply(numero1, numero2);
        double division = c.divide(numero1, numero2);

        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);
        System.out.println("Resultado de la multiplicación: " + multiplicacion);
        System.out.println("Resultado de la división: " + division);
    
    }
    
}
