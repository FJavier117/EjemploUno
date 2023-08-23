package com.qa.test3;

public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Lenovo");
        Computadora computadora2 = new Computadora("Apple",new Monitor("Dell","1234"),new Teclado("Dell", "Inalambrico"));
        System.out.println(computadora);
        System.out.println(computadora2);

        Silla silla = new Silla();
    }
}
