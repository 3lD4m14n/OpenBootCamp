package com.ejercicio;

public class Trabajador extends Persona{
    int salario;

    public Trabajador(String nombre, int edad, String telefono, int salario){
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
