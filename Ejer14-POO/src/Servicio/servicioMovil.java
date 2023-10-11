/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioMovil {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   public Movil cargarCelular(){
        /*ovil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int [] codigo) */
        System.out.println("Ingrese la marca");
        String marca=leer.next();
        System.out.println("Ingrese el precio");
        double precio=leer.nextDouble();
        System.out.println("Ingrese el modelo");
        String modelo=leer.next();
        System.out.println("Ingrese la memoria RaM");
        int memoriaRam=leer.nextInt();
        System.out.println("Ingrese el almacenamiento");
        int almacenamiento=leer.nextInt();
        int [] codigo=new int[7];
        Movil m = new Movil(marca,precio,modelo,memoriaRam,almacenamiento,codigo);
        return m;
    }
    
   public void ingresarCodigo( Movil m){
      String cod;
       do {
      System.out.println("Ingrese el código del móvil");
       cod=leer.next(); 
       }while (cod.length()<7 || cod.length()>7);
           
        int [] codigo=new int[7];
        
       for (int i=0;i<7;i++){
           codigo[i]= Character.getNumericValue(cod.charAt(i));
                   ;
           System.out.println(" codigo " + i+" "+codigo[i]);
       }
       m.setCodigo(codigo);
       
   }
}
