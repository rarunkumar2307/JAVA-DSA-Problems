package com.dsa.HashSet;
import java.util.HashSet;

public class CheckSubset {
    public static void main(String[] args){
        int[] arr1={1,1,3,4,5,2};
        int[] arr2={2,4,3,1,7,5,15};
        if(check(arr1,arr2)) System.out.println("arr1 is subset of arr2");
        else System.out.println("arr1 is not subset of arr2");
    }
    public static boolean check(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr2) set.add(num);

        boolean subset=true;

        for(int num:arr1){
            if(!set.contains(num)){
                subset=false;
                return false;
            }
        }
        return true;
    }
}
