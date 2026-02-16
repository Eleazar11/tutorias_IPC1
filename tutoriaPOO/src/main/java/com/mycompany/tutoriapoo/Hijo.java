/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutoriapoo;

/**
 *
 * @author eleaz
 */
public class Hijo extends Madre {

    void recibirMensaje() {
        System.out.println("Hijo: Escuché el mensaje");
        buscarAspirina();
    }

    void buscarAspirina() {
        System.out.println("Hijo: Voy a buscar aspirina");
    }
    
    void comunicarseFarmaceutica(){
        System.out.println("Hijo: Necesito una aspirina");
        
    }
}

