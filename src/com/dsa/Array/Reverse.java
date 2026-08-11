package com.dsa.Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.print("[");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

        solution obj=new solution();

        int[] result=solution.reverse(arr);//obj.reverse(arr); also okay
        for(int res:result) System.out.print(res+" ");


    }
}

class solution{
    public static int[] reverse(int[] arr){
        int n=arr.length;

        int[] ans=new int[n];

        for(int i=0;i<arr.length;i++){
            ans[i]=arr[n-1-i];
        }
        return ans;
    }
}
