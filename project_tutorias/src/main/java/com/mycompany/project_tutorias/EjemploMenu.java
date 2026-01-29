/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.project_tutorias;

import java.util.Scanner;

/**
 *
 * @author eleaz
 */
public class EjemploMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreUsuarioJuego;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido ");
        System.out.println("ingrese su nombre");
        nombreUsuarioJuego = scanner.nextLine();
        saludar(nombreUsuarioJuego);
        
    }
    
         //METODO PARA SALUDAR CUANDO ENVIAMOS DATOS
    public static void saludar(String nombre) {
        System.out.println("hola, este es un saludo " + nombre);
    }
    
}
