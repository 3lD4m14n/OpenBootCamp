package com.simple;

public class Coche {
    int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    public void agregarPuerta(int puerta){
        this.numPuertas = this.numPuertas + puerta;
    }
}
