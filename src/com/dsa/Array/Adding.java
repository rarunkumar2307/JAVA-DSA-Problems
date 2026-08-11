package com.dsa.Array;

public class Adding {
    public static void main(String[] args){
        int[] arr={2,3,4,5,6};
        arr=add(arr,0,1);
        arr=add(arr,3,9);
        arr=add(arr,7,7);
        for(int res:arr) System.out.print(res+"  ");
    }
    public static int[] add(int[] arr, int ind,int val){
        int[] newArr=new int[arr.length+1];

        for(int i=0;i<newArr.length;i++){
            if(i<ind) newArr[i]=arr[i];
            else if(ind==i) newArr[ind]=val;
            else newArr[i]=arr[i-1];
        }
        return newArr;
    }
}
