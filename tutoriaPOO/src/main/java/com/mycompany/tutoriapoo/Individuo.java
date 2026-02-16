/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutoriapoo;

/**
 *
 * @author eleaz
 */
public class Individuo {
    public String nombre;
    public int salud;
    public int nivel;
    
    public int subirNivel(int nivelJugador){
        nivelJugador = nivelJugador + 1;
        return nivelJugador;
    }
    
    
    
}
