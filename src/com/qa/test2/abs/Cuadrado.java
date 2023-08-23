package com.qa.test2.abs;

public class Cuadrado extends FiguraGeometrica {
    float lado;

    public Cuadrado(float lado){
        this.lado = lado;
    }
    @Override
    public float area() {
        return lado * lado;
    }

}
