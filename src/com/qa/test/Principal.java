package com.qa.test;

import java.util.Scanner;
public class Principal {
    // Esto un comentario simple
    /*
       1. public
       2.  estatico
       3. no devuleve nada
       4. main
       5. String [] args
     */

    /**
     * @author FJMV
     * @version 1.0
     */

   public static void main(String[] args){
       ImprimirSaludo imprimirSaludo = new ImprimirSaludo(new Scanner(System.in));
       imprimirSaludo.imprimir();
   }

}
