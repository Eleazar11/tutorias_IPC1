/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project_tutorias;

import java.util.Scanner;

public class Project_tutorias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre;
        int opcionMenu;

        System.out.println("Bienvenido al sistema de juegos");
        saludar();

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        saludar(nombre);

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Juego 1");
            System.out.println("2. Juego 2");
            System.out.println("3. Juego 3");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");

            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
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
                    System.out.println("Gracias por jugar.");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcionMenu != 0);
    }

    // MÉTODO PARA SALUDAR
    public static void saludar() {
        System.out.println("Este método está saludando");
    }

    // MÉTODO PARA SALUDAR CON NOMBRE
    public static void saludar(String nombre) {
        System.out.println("Bienvenido al juego, " + nombre);
    }
}
