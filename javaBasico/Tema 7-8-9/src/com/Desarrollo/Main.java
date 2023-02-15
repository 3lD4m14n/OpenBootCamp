package com.Desarrollo;

import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static String reverse(String text) {
        StringBuilder reverse = new StringBuilder();

        for( int i = text.length() - 1 ; i >= 0 ; i-- ){
            reverse.append(text.charAt(i));
        }

        return reverse.toString();
    }

    public static void viewValues(String[] values){
        for( String element : values ){
            System.out.print(element + " ");
        }
    }

    public static void viewArray2D(int[][] array){
        for( int i = 0 ; i < array.length ; i++ ){
            for( int j = 0 ; j < array[i].length ; j++ ){
                System.out.println( i + " " + j + ": " + array[i][j] );
            }
        }
    }

    public static void viewListValues(List<String> list){
        for( String element : list ){
            System.out.print( element + " " );
        }
        System.out.print("\n");
    }

    public static void main( String[] args ){
        System.out.println( reverse("hola mundo") );

        //1)
        String[] words = {"hello", "world", "i'm", "Damian"};
        viewValues( words );

        //2)
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        viewArray2D(array);

        //3)
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("vector antiguo: " + vector);
        vector.remove(3);
        vector.remove(2);
        System.out.println("vector nuevo: " + vector);

        //4)Si utilizamos un vector con la capacidad por defecto entonces el programa debera hacer
        //mucho trabajo extra para redimensionar varias veces el array interno

        //5)
        ArrayList<String> AList = new ArrayList<>();
        AList.add("Hola");
        AList.add("Soy");
        AList.add("El");
        AList.add("Damian");
        LinkedList<String> BList = new LinkedList<>(AList);
        viewListValues(AList);
        viewListValues(BList);
    }
}
