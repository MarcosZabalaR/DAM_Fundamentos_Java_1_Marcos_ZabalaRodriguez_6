package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca los números a comparar.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        comparar(a,b);
    }

    /*
    La función main sirve para crear la variable scanner e inicializar los valores a y b.
     */

    private static void comparar(int a, int b) {
        if(a%b==0){
            System.out.println("Son múltiplos");
        }else{
            if(b%a==0){
                System.out.println("Son múltiplos");
            }else{
                System.out.println("No son múltiplos");
            }
        }
    }

    /*
    Función para comprobar si son múltiplos o no.
     */

}
