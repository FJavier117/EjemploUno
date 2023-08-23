package com.qa.test2.abs;

public class Triangulo extends FiguraGeometrica {
    float base;
    float altura;

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return base * altura / 2;
    }
}
