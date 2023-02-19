package com.Desarrollo;

import java.util.AbstractMap;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintStream;
import java.io.IOException;

public class ejercicio9 {
    public static void printFoodHash(
            PrintStream writer,
            HashMap<
                    String,
                    HashMap<
                        String,
                        HashMap<
                            AbstractMap.SimpleEntry<
                                String,
                                String
                            >,
                            Integer
                        >
                    >
            > foodCant
    ) {
        for (
                Map.Entry<
                        String,
                        HashMap<
                            String,
                            HashMap<
                                AbstractMap.SimpleEntry<
                                    String, String
                                >,
                                Integer
                            >
                        >
                > group : foodCant.entrySet()
        ) {
            writer.println(group.getKey() + ":");
            for (
                    Map.Entry<
                            String,
                            HashMap<
                                AbstractMap.SimpleEntry<
                                        String, String
                                        >,
                                    Integer
                                >
                            > subgroup : group.getValue().entrySet()
            ) {
                writer.println( "\t" + subgroup.getKey());
                for(
                        Map.Entry<
                            AbstractMap.SimpleEntry<
                                String, String
                            >,
                            Integer
                        > foodName : subgroup.getValue().entrySet()
                ){
                    writer.println("\t\t" + "Food Name:" + foodName.getKey().getKey());
                    writer.println("\t\t" + "Scientific Name:" + foodName.getKey().getValue());
                    writer.println("\t\t" + "Cant:" + foodName.getValue() + "\n");
                }
            }
        }
    }

    public static void printList( PrintStream writer,
                                  LinkedList<String> list
    ){
        for( String element : list ){
            writer.println(element);
        }
    }

    public static void main( String[] args ){

        //el siguiente hashmap esta destinado a contar cuantas veces aparece una determinada comida en el csv
        HashMap<
                String,
                HashMap<
                        String,
                        HashMap<
                                AbstractMap.SimpleEntry<
                                        String,
                                        String>,
                                Integer
                        >
                >
        > foodCant = new HashMap<>();
        //la siguiente lista tiene por objetivo simplemente guardar cada comida que haya sin contar cantidad
        LinkedList<String> food = new LinkedList<>();

        try{
            InputStream csv = new FileInputStream("generic_food.csv");
            InputStreamReader csvReader = new InputStreamReader(csv);
            BufferedReader csvBuffer = new BufferedReader(csvReader);

            String line;
            csvBuffer.readLine(); // skip the first line
            while ((line = csvBuffer.readLine()) != null){

                String[] field = line.split(",");
                HashMap<String, HashMap< AbstractMap.SimpleEntry<String, String> , Integer> > group;

                if( ( group = foodCant.get(field[2]) ) == null ){
                    foodCant.put(field[2], new HashMap<>());
                    group = foodCant.get( field[2] );
                }

                HashMap< AbstractMap.SimpleEntry<String, String> , Integer> subgroup;

                if( ( subgroup = group.get(field[3]) ) == null ){
                    group.put(field[3], new HashMap<>());
                    subgroup = group.get( field[3] );
                }

                AbstractMap.SimpleEntry<String, String> foodName =
                        new AbstractMap.SimpleEntry<>(field[0],field[1]);

                Integer numberFood;
                if( ( numberFood = subgroup.get( foodName ) ) == null ){
                    numberFood = 0;
                    food.add(field[0]);
                }

                subgroup.put( foodName, numberFood + 1 );
            }

            csv.close();

            File archive = new File("foodListCant");
            PrintStream writer = new PrintStream(archive);

            printFoodHash(writer,foodCant);
            writer.close();

            archive = new File("foodList");
            writer = new PrintStream(archive);

            printList(writer,food);


        }catch ( IOException e){
            System.out.println("Error: " + e.getMessage() );
        }
    }
}
