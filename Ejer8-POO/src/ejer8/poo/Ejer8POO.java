/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8.poo;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Ejer8POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    Cadena c1;
    ServicioCadena sc=new ServicioCadena();
    c1=sc.crearCadena();
    int cant=sc.mostrarVocales(c1);
    String fi=sc.invertirFrase(c1);
        System.out.println("La cantidad de vocales es "+cant+" y la frase invertida es  "+fi);
        System.out.println("Ingrese la letra que desea buscar");
        String letra=leer.next();
        sc.vecesRepetido(c1, letra);
        
        
        System.out.println("Ingrese una nueva frase para comparar");
        String frase2=leer.next();
        
    sc.unirFrases(c1, frase2);
        System.out.println("Ingrese el caracter que reemplazamos por la a");
        String carac=leer.next();
        sc.reemplaza(c1, carac);
    System.out.println("Ingrese una letra a buscar en la frase");
    String letra4=leer.next();
    if  (sc.contiene(c1, letra4)) {
        System.out.println("Se encontro la letra");
    }else{
        System.out.println("Sorry, dont found");
    }
    }
    
}
