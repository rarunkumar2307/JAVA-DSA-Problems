package com.dsa.Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr={1,3,2,4,9,5,7};
        insertion(arr);
    }
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int res:arr) System.out.print(res+" ");
    }
}
