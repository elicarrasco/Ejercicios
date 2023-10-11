/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13.poo;

import Entidad.Curso;
import Servicio.servicioCurso;

/**
 *
 * @author Usuario
 */
public class Ejer13POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    servicioCurso c = new servicioCurso();
    Curso c1;
    c1=c.crearCurso();
        System.out.println("La ganacia es "+ c.calcularGanancias(c1));
    }
    
}
