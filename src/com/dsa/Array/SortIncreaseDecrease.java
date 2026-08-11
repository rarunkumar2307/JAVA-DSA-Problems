package com.dsa.Array;

public class SortIncreaseDecrease{
    public static void main(String[] args){
        int[] arr={1,2,6,7,3,8,4,5};
        sort(arr);
        for(int result:arr) System.out.print(result+" ");
        System.out.println();
        for(int i=arr.length-1;i>=0;i--) System.out.print(arr[i]+" ");
        //Soring 1st Half in ascending and 2nd half in descending
        System.out.println();
        new_sort(arr);

    }
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void new_sort(int[] arr){
        for(int i=arr.length/2,j=arr.length-1;i<j;i++,j--){
            if(arr[i]<arr[j]){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        for(int res:arr) System.out.print(res+" ");
    }
}
