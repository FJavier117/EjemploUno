package com.qa.test3;

public class Computadora {
    //relación simple agregación
    Monitor monitor;
    Teclado teclado;

    String marcaDeComputadora;

    public Computadora(String marcaDeComputadora){
        this. marcaDeComputadora = marcaDeComputadora;
        teclado = new Teclado();
        monitor = new Monitor();
    }
    public  Computadora (String marcaDeComputadora, Monitor monitor, Teclado teclado){
        this.teclado = teclado;
        this.monitor = monitor;
        this.marcaDeComputadora = marcaDeComputadora;
    }

    @Override
    public String toString(){
        return marcaDeComputadora +" "+ teclado +" "+ monitor;
    }

}
