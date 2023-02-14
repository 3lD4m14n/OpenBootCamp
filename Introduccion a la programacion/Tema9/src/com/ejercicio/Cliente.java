package com.ejercicio;

public class Cliente extends Persona{
    public int credito;

    public Cliente(String nombre, int edad, String telefono, int credito){
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                "} " + super.toString();
    }
}
