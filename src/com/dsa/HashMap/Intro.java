package com.dsa.HashMap;
import java.util.HashMap;

public class Intro {
    public static void main(String[] args){
        HashMap<String,Integer> population=new HashMap<>();
        //ADD
        population.put("India",140);
        population.put("USA",33);
        population.put("RUSIA",80);
        population.put("India",140);

        //GET
        System.out.println(population.get("India"));
        System.out.println(population.get("RUSSIA"));

        //CHECK
        System.out.println(population.containsKey("India"));
        System.out.println(population.containsKey("USA"));

        //TRAVERSE
        for(String res:population.keySet()) System.out.println(res+" "+population.get(res));

        //SIZE
        System.out.println("SIZE :"+population.size());
    }
}
