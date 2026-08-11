package com.dsa.Array;
import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,1,5,6,2};

        for(int res:arr) System.out.print(res+" ");
        System.out.println();

        HashMap<Integer,Integer> set=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (set.containsKey(arr[i])) {
                count++;
            } else {
                set.put(arr[i],0);
            }
        }

        System.out.println(count);
    }
}
