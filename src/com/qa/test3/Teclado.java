package com.qa.test3;

public class Teclado {
    String marca;
    String tipo;

    public Teclado(){
        marca = " ";
        tipo = " ";
    }

    public Teclado(String marca, String tipo){
        this. marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return marca + " " + tipo;
    }
}
