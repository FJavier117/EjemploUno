package com.qa.test2.abs;

public class MainAbs {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(23,12);
        FiguraGeometrica cuadrado = new Cuadrado(24);
        System.out.println("Area del triangulo: " + triangulo.area());
        System.out.println("Area del cuadrado: " + cuadrado.area());

    }
}
