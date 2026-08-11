package com.dsa.Array;

class block_swap {
    void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    void left_rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        if(k==0) return;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    void right_rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        if(k==0) return;

        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
}

public class BlockSwap {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int k=2;

        block_swap obj=new block_swap();

        obj.left_rotate(arr,k);
        System.out.println("LEFT ROTATE: ");
        for(int res:arr) System.out.print(res+" ");
        System.out.println();

        arr=new int[]{1,2,3,4,5};

        obj.right_rotate(arr,k);
        System.out.println("RIGHT ROTATE: ");
        for(int res:arr) System.out.print(res+" ");
    }
}
