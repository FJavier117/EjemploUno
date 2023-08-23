package com.qa.test;

import java.util.Scanner;

public class ImprimirSaludo {
    private final Scanner scanner;
    public ImprimirSaludo(Scanner scanner){
        this.scanner = scanner;
    }
    public void imprimir(){
        String saludo = scanner.nextLine();
        System.out.println(saludo);
    }
}
