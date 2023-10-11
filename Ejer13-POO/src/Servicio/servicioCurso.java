/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioCurso {
    Scanner leer =new Scanner(System.in).useDelimiter("\n");
    /*  private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos= new String[5];*/
    public String[] cargarAlumnos(){
        String[] alumnos= new String[5];
         for (int i=0 ; i<5 ; i++){
            System.out.println(" Ingrese el nombre del alumno "+i);
            alumnos[i]=leer.next();
        }
         return alumnos;
    }
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso=leer.next();
        System.out.println("Ingrese la cantidad de horas por día");
        int cantidadHorasPorDia=leer.nextInt();
        System.out.println("Ingrese la cantidad de días por semana");
        int cantidadDiasPorSemana=leer.nextInt();
        System.out.println("Ingrese el turno (mañana o tarde) ");
        String turno=leer.next();
        System.out.println("Ingrese el precio por hora");
        double precioPorHora=leer.nextDouble();
        String [] alumnos=cargarAlumnos();
        Curso c = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno,precioPorHora,alumnos);
        return c;
           
    }
    
    public double calcularGanancias(Curso c){
      double ganancia;
      ganancia=c.getCantidadHorasPorDia()*c.getPrecioPorHora()*c.getAlumnos().length*c.getCantidadDiasPorSemana();
      return ganancia;
    }
}
