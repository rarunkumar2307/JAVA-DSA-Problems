package com.dsa.Recursion;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        print(arr,0);
        }
    public static void print(int[] arr,int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i]+" ");
        print(arr, i + 1);
    }
}


//public class PrintArray {
//    static Scanner sc=new Scanner(System.in);
//    public static void main(String[] args){
//        int[] arr=new int[5];
//        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
//        print(arr,0);
//    }
//    public static void print(int[] arr, int i){
//        if(arr.length==i) return;
//        else{
//            System.out.print(arr[i]);
//            i++;
//        }
//        if(arr.length!=i) System.out.print("->");
//        print(arr,i);
//    }
//}
