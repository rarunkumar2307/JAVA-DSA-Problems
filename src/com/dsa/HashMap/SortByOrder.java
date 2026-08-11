package com.dsa.HashMap;
import java.util.*;

public class SortByOrder {
    public static void main(String[] args){
        int[] arr1={2,1,2,5,7,1,9,3,6,8,8};
        int[] arr2={2,1,8,3};
        order(arr1,arr2);
    }
    public static void order(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr1) map.put(num,map.getOrDefault(num,0)+1);

        for(int num:arr2){
            if(map.containsKey(num)){
                int count=map.get(num);

                for(int i=0;i<count;i++) System.out.print(num+" ");
                map.remove(num);
            }
        }

        List<Integer> remaining=new ArrayList<>(map.keySet());
        Collections.sort(remaining);

        for(int val:remaining) {
            int count=map.get(val);
                for(int i=0;i<count;i++){
                    System.out.print(val+" ");
                }
        }
    }
}
