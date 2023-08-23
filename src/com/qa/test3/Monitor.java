package com.qa.test3;

public class Monitor {
    String marca;
    String modelo;

    public Monitor(){
        marca = " ";
        modelo = " ";
    }

    public Monitor(String marca, String modelo){
        this. marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
