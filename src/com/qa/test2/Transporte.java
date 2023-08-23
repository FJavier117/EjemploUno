package com.qa.test2;

public class Transporte {
    /*

        POJO Plain Old Java Object

        Atributos
        1. Color
        2. Velocidad
        3. Tipo
        4. Capacidad
        Compotamientos/Metodos
        1. Avanzar
        2. Frenar
     */
    /*
        publicos/public
        privado/private
        protegido/ protected
        defecto/
     */

    private String color;
    private String velocidad;
    private String tipo;
    private String capacidad;

    public Transporte(){

    }

    public Transporte(String color, String velocidad, String tipo, String capacidad){
        this.color = color;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public void avanzar(){
        System.out.println("Clase Padre metodo avanzar");
    }
    public void frenar(){
        System.out.println("Clase Padre metodo frenar");
    }


  /*  public void setColor(String color){
        this.color = color;
    }

    public void setVelocidad(String velocidad){
        this.velocidad = velocidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }*/

    public String getColor(){
        return color;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    @Override // Polimorfismo por anulación o sobreescritura
    public String toString() {
        return "color='" + color +
                ", velocidad='" + velocidad +
                ", tipo='" + tipo +
                ", capacidad='" + capacidad;
    }


}
