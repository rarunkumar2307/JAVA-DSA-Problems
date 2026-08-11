package com.dsa.Array;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr={1,23,-46,25,87,5,12};
        int MIN=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (MIN<arr[i]){
                MIN=arr[i];
            }
        }
        System.out.println("Maximum number is "+MIN);
    }
}
