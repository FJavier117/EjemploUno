package com.qa.test2;

public class Coche extends Transporte {
    String tipoTransmision;

    public Coche(){

    }
    public Coche(String color, String velocidad, String tipo, String capacidad, String tipoTransmision){
        super(color, velocidad, tipo, capacidad);
        this.tipoTransmision = tipoTransmision;
    }


    @Override
    public void avanzar() {
        System.out.println("Aplicando polimorfismo por anulación desde la clase Coche");

    }

    @Override
    public void frenar() {
        System.out.println("Aplicando polimorfismo por anulación desde la clase Coche");
    }

    @Override
    public String toString() {
        return super.toString() +" "+ tipoTransmision;
    }
}
