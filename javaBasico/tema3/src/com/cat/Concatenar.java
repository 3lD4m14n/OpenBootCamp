package com.cat;

public class Concatenar {
    public static String concatenar2( String s1, String s2 ) {
        return s1 + s2;
    }

    public static String concatenarArray( String[] Strings ){
        String resultado = "";

        for ( String palabra : Strings ){
            resultado = resultado + palabra;
        }

        return resultado;
    }
}
