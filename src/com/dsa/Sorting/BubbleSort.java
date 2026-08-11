package com.dsa.Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={3,2,4,5,3,56,26,4,6,9};
        bubble(arr);
    }
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int res:arr) System.out.print(res+" ");
    }
}
