package com.prueba;

public class main {
    public static void main(String[] args){
        int numeroIf = 2;
        if( numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if( numeroIf < 0 ){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }

        int numeroWhile = 0;
        while( numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (false);

        String estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otonno":
                System.out.println("Es otonno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }
}
