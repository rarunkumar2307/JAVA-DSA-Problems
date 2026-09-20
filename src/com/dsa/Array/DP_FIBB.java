package com.dsa.Array;

public class DP_FIBB {
    public static void main(String[] args){
        int[] arr=new int[8];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++) arr[i]=arr[i-1]+arr[i-2];
        System.out.print(arr[arr.length-1]);
    }
}
