/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCadena {
    
    public Cadena crearCadena(){
    Scanner leer =new Scanner(System.in).useDelimiter("\n");
    System.out.println("Ingrese la frase ");
    String frase =leer.next();
    int longitud=frase.length();
      Cadena c = new Cadena();
    c.setFrase(frase);
    c.setLongitud(longitud);
    return c;
    }
    
    public int mostrarVocales(Cadena c) {
        int cant = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);

            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            cant+=1;
            }
        }
        return cant;
    }
    
    public String invertirFrase(Cadena c){
       String fraseInvertida="";
       for (int i=c.getLongitud()-1 ; i>=0 ; i--){
           fraseInvertida+=c.getFrase().substring(i, i + 1);
       }
       return fraseInvertida;
    }
    
    public void vecesRepetido(Cadena c , String l) {
        int cant = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);

            if (letra.equalsIgnoreCase(l)) {
            cant+=1;
            }
        }
        System.out.println("La letra "+l+" se repite "+cant+" veces");
    }
    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena c , String frase2) {
        int longitud2=frase2.length();
        
             if (longitud2>c.getLongitud()) {
                 System.out.println("La longitud es mas larga que la primera");
            }else if (longitud2<c.getLongitud()){
                System.out.println("La longitud es mas corta que la primera");
        }else {
                 System.out.println("La longitud es igual a la primera");
            }
    }
    
    public void unirFrases(Cadena c, String frase2){
        System.out.println(c.getFrase()+frase2);
    }
    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.*/
    public void reemplaza(Cadena c, String carac) {
        String fraseNueva = "";
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);

            if (letra.equalsIgnoreCase("a")) {
                fraseNueva += carac;
            } else {
                fraseNueva += letra;
            }
        }
        System.out.println("La frase nueva es " + fraseNueva);
    }
    public boolean contiene(Cadena c, String letra1) {
        boolean bandera = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(letra1)) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }
}




