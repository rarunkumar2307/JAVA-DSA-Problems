package com.dsa.HashMap;
import java.util.Arrays;

public class Equilibrium {
    public static void main(String[] args){
        int[] arr={1,-1,4};
        System.out.println(equilibrium(arr));
    }
    public static int equilibrium(int[] arr){
        int total=0;
        for(int tol:arr){
            total+=tol;
        }
        int left=0;
        for(int i=0;i<arr.length;i++){
            int right=total-left-arr[i];
            if(right==left){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}
