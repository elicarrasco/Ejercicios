/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer14.poo;

import Entidad.Movil;
import Servicio.servicioMovil;

/**
 *
 * @author Usuario
 */
public class Ejer14POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioMovil sm=new servicioMovil();
        Movil m1;
        m1=sm.cargarCelular();
        sm.ingresarCodigo(m1);
    }
    
}
