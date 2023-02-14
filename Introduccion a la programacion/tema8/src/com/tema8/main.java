package com.tema8;

public class main {

    public static void presentar( Persona alguien ){
        System.out.println( "La persona es " + alguien.getNombre() );
        System.out.println( "Tiene " + alguien.getEdad() + " annos");
        System.out.println( "Su numero telefonico es: " + alguien.getTelefono() );
    }
    public static void main(String[] args) {
        Persona damian = new Persona();

        damian.setNombre("Damian");
        damian.setEdad(20);
        damian.setTelefono("098472214");

        presentar(damian);
    }
}
