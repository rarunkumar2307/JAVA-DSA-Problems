package com.dsa.Array;

//Sort the Array and Find the Meddle value in Array

public class Median {
    public static void main(String[] args){
        int[] arr={6,5,4,1,2,3,9,10,8,7};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(int res:arr) System.out.print(res+" ");

        System.out.println();

        int mid=(arr.length-1)/2;

        System.out.println("MIDDLE VAL: "+arr[mid]);
    }
}
