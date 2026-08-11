package com.dsa.Array;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={6,7,9,5,3,10};
        int k=1;
        Binary(arr,k);
    }
    public static void Binary(int[] arr,int k){
        Arrays.sort(arr);
        int n=arr.length;
        int low =0, high =n-1;
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>k) high=mid-1;
            else if(arr[mid]<k) low=mid+1;
            else{
                ans=mid;
                break;
            }
        }
        System.out.println("The Sorted Array :"+Arrays.toString(arr));
        if(ans!=-1){
            System.out.println("The Index value Present in :"+ans);
        }else System.out.println("Not Present");
    }
}
