package com.dsa.Recursion;

public class FindIndex {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int x=5;
        System.out.println(findx(arr,0,x));
    }
    public static int findx(int[] arr,int i,int x){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==x){
            return i;
        }

        int ind=findx(arr,i+1,x);
        return ind;
    }
}
