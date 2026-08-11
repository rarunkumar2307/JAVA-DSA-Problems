package com.dsa.Array;
import java.util.Arrays;

public class Repeated {
    public static void main(String[] args){
        int[] arr={1,1,3,4,3,2,5,3,5,6,7,8,8};
        Arrays.sort(arr);
        repeat(arr);
        System.out.println();
        nonrepeating(arr);
    }
    public static void repeat(int[] arr) {
        int c=0;
        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] == arr[i + 1]) {
                c++;
                System.out.print(arr[i] + " ");

                while (i < arr.length - 1 && arr[i] == arr[i + 1]) i++;
            }
        }
        System.out.println("\nRepeating Values :"+c);
    }
    public static void nonrepeating(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            boolean chk=false;
            for(int j=0;j<arr.length;j++){

                if(i!=j && arr[i]==arr[j]) {
                    chk=true;
                    break;
                }
            }
            if(!chk) {
                System.out.print(arr[i]+" ");
                c++;
            }
        }
        System.out.println("\nNon Repeating :"+c);
    }
}
