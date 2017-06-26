/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;



/**
 *
 * @author cice
 */
public class Calculadora {
    
    //variable global de la clase
    //al no inicializarla con ningún valor y ser un tipo primitivo, sale con 0. La suma sería valor de "a"+valor de "b"+ 0 (a no ser que le diesemos valor.
    
    static int c;
    
    
    //metodo estatico
    public static int suma (int a, int b){

        

    return a+b+c;
}
    //metodo no estatico
    public int resta (int a, int b){
    
        return a-b;
        
    }
    
    public static int sumaresta(int a, int b){
    //aquí llamamos a suma que es estatica y por eso podemos, si llamaos a resta no podríamos porque no es estatica. La restricción es de static a no static pero no al reves.
    return suma(a,b);
    
    }
    
}
