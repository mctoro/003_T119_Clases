/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

/**
 *
 * @author Miguel
 */
public class Principal {
    
    public static void main(String... args){
        
        //creemos coches!!!
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        
        //coche1.arrancar();
        //coche1.acelerar();
        //coche1.frenar();
        //coche1.apagar();
        
        coche1.bastidor = "BA123456";
        coche2.bastidor = "CA987654";
        
        System.out.println(coche1.bastidor);
        System.out.println(coche2.bastidor);
        
        coche1.modelo = "Auris";
        System.out.println(coche1.modelo);
        
        System.out.println(coche2.modelo);
        
        Coche coche3 = new Coche();
        System.out.println(coche3.modelo);
        
        coche3.modelo = "Aygo";
        
        System.out.println(coche1.modelo);
        System.out.println(coche2.modelo);
        System.out.println(coche3.modelo);
    }
    
}