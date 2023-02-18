package com.Desarrollo;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ejercicio9 {
    public static void main( String[] args ){

        HashMap<String, HashMap<String, HashMap< AbstractMap.SimpleEntry<String, String> , Integer> > > foodCant =
                new HashMap<>();
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
        }catch ( IOException e){

        }/*catch ( FileNotFoundException e ){

        }*/
    }
}
