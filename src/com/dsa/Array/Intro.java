package com.dsa.Array;

public class Intro {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        //GET
        System.out.println(arr[4]);
        //SET
        arr[2]=4;
        System.out.println(arr[2]);
        //LENGTH
        System.out.println(arr.length);

        //TRAVERSE AN ARRAY
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
