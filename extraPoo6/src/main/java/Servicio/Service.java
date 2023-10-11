/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Nicolàs Medina
 */
public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado a1 = new Ahorcado();
    int var = 0;
    String pal;

    //crea un nuevo objeto Ahorcado
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra para jugar");
        pal = leer.next();
        String[] palabraSecreta = new String[pal.length()];

        for (int i = 0; i < pal.length(); i++) {
            palabraSecreta[i] = pal.substring(i, i + 1);
        }

        a1.setPalabraSecreta(palabraSecreta);

        System.out.println("Ingresa la cantidad de jugadas maximas");
        a1.setCantidadIntentos(leer.nextInt());

        a1.setCantidadLetras(0);

        return new Ahorcado();
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + a1.palabraSecreta.length);
    }

    public void buscar(String letra) {

        for (int i = 0; i < a1.getPalabraSecreta().length; i++) {

            if (a1.getPalabraSecreta()[i].equalsIgnoreCase(letra)) {
                System.out.println("La letra está");

            } else {
                System.out.println("La letra no se encuentra");
            }

        }
    }

    public boolean encontradas(String letra) {

        int cont = 0;

        for (int i = 0; i < a1.getPalabraSecreta().length; i++) {

            if (a1.getPalabraSecreta()[i].equalsIgnoreCase(letra)) {

                cont = cont + 1;
                var = var + cont;
            }
        }

        System.out.println("Número de letras (encontradas, faltantes): " + "(" + cont + " , " + (a1.getPalabraSecreta().length - cont) + ")");

        if (cont == 0) {
            a1.setCantidadIntentos(a1.getCantidadIntentos() - 1);
            return false;
        } else {
            return true;
        }

    }

    public void intentos() {
        System.out.println("Cantidad de oportunidades restantes: " + a1.getCantidadIntentos());
    }

    public void juego() {
        Service v1 = new Service();
        v1.crearJuego();
        v1.longitud();
        

        System.out.println("Escribe una letra");
        String letra = leer.next();
        v1.buscar(letra);
        
        do {
            v1.encontradas(letra);
        } while (a1.getCantidadIntentos() > 0 || var != a1.getPalabraSecreta().length);

        if (var == a1.getPalabraSecreta().length) {
            System.out.println("Encontraste la palabra secreta: " + pal);
        } else {
            System.out.println("Se acabaron los intentos");
        }

    }
}
