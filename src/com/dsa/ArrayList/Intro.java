package com.dsa.ArrayList;
import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {

        //ADDING AN ELEMENT IN ARRAYLIST
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(1,20);
        list.add(2,30);
        System.out.println(list);

        //OR
        ArrayList<Integer> list2=new ArrayList<>(java.util.List.of(10,20,30,40,50));
        System.out.println(list2);

        //GET
        System.out.println(list2.get(2));

        //SET
        list.set(2,25);
        System.out.println(list);

        //SIZE
        System.out.println(list2.size());

        //GET THE INDEX VALUE
        System.out.println(list2.indexOf(50));//If Not Found Return -1

        //TO STRING
        list.toString();//It is unnecessary bz compiler do this automatically
        System.out.println(list);

        //REMOVE
        list2.remove(1);
        System.out.println(list2);

        //REMOVE ALL DATA FROM THE LIST
        list.clear();
        System.out.println(list);


    }
}
