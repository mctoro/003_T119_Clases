/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

import java.util.Date;

/**
 *
 * @author Miguel
 */
public class Coche {
    
    //atributos o variables
    //caracteristicas
    static String modelo;
    
    String color;
    String matricula;
    String bastidor;
    int potencia;
    Date fecha;
    boolean esAndando;
    boolean esEncendido;
    
    //constructora OHL
    Coche(){

    }
    
    
    //funciones
    void acelerar(){
        System.out.println("Estoy acelerando");
    }
    
    void frenar(){
        System.out.println("Estoy frenando");
    }
    
    void arrancar(){
        System.out.println("Arrancando...");
    }
    
    void apagar(){
        System.out.println("Ya me apago...");
    }
    
}