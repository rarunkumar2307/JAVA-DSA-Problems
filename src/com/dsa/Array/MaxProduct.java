package com.dsa.Array;

public class MaxProduct {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,0};
        int[] arr2={1,2,-3,0,-4,-5};
        System.out.println("Product :"+maxproduct(arr));
        System.out.println("Product :"+maxproduct(arr2));

    }
    public static int maxproduct(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i],max*arr[i]);
            min=Math.min(arr[i],min*arr[i]);

            result=Math.max(result,max);
        }
        return result;
    }
}
