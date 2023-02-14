package com.simple;

public class main {
    public static int sumar3( int num1, int num2, int num3 ){
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        System.out.println( sumar3(1,2,3) );

        Coche auto = new Coche(4);
        auto.agregarPuerta(1);
        System.out.println( "El auto tiene: " + auto.numPuertas );
    }
}
