/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Nicolàs Medina
 */
public class Ahorcado {
    public String[] palabraSecreta;
    public int cantidadLetras;
    public int cantidadIntentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraSecreta, int cantidadLetras, int cantidadIntentos) {
        this.palabraSecreta = palabraSecreta;
        this.cantidadLetras = cantidadLetras;
        this.cantidadIntentos = cantidadIntentos;
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }
    
    
}
