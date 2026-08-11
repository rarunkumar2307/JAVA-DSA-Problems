package com.dsa.Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,10,9,7,8};
        selectsort(arr);
    }
    public static void selectsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minindex =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex])
                    minindex =j;
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        for(int res:arr){
            System.out.print(res+" ");
        }
    }
}
