package com.qa.test2;

public class Caballo extends Transporte {
    String raza;

    public Caballo(){

    }

    public Caballo(String color, String velocidad, String tipo, String capacidad, String raza){
        super(color, velocidad, tipo, capacidad);
        this.raza = raza;
    }

    @Override
    public void avanzar() {
        System.out.println("Aplicando polimorfismo por anulación desde la clase Caballo");
    }

    @Override
    public void frenar() {
        System.out.println("Aplicando polimorfismo por anulación desde la clase Caballo");
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getCapacidad() {
        return super.getCapacidad();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public String getVelocidad() {
        return super.getVelocidad();
    }




}
