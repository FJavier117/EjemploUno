package com.qa.test3;

public class Silla {
    //Relación fuerte
    String nombre;
    Integer edad;
    Double precio;
    Character curp;
    
    Respaldo respaldo;
    Patas patas;



    public Silla(){
        patas = new Patas();
        respaldo = new Respaldo();
    }

}
