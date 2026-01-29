/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_tutorias;

import java.util.Scanner;

/**
 *
 * @author eleaz
 */
public class Project_tutorias { 

    public static void main(String[] args) {
        String nombre;
        int opcionMenu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        saludar();
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        saludar(nombre);
        System.out.println("elija su opcion");
        System.out.println("juego 1");
        System.out.println("juego 2");
        System.out.println("juego 3");
        opcionMenu=scanner.nextInt();
     
            switch (opcionMenu){
                case 1:
                    Juego1.ejecucion();
                    break;
                case 2:
                    Juego2.ejecucion();
                    break;
                case 3: 
                    Juego3.ejecucion();
                    break;
                case 0:
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    
                    break;
                default:
                    System.out.println("Este numero no cumple con ninguna opcion");
            }
       
    }

    //METODO PARA SALUDAR
     public static void saludar() {
        System.out.println("ESTE METODO ESTA SALUDANDO");
    }
    
     //METODO PARA SALUDAR CUANDO ENVIAMOS DATOS
    public static void saludar(String nombre) {
        System.out.println("Bienvenido al juego " + nombre);
    }
    
}
