package com.dsa.HashMap;
import java.util.HashMap;
import java.util.Arrays;

public class RankTheElement {
    public static void main(String[] args){
        int[] arr={4,6,12,56,98,5,24,90,72,1};
        rank(arr);
    }
    public static void rank(int[] arr){
        HashMap<Integer,Integer> num=new HashMap<>();

        int[] newarr=arr.clone();
        Arrays.sort(newarr);
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if(!num.containsKey(newarr[i])){
                num.put(newarr[i],rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"->"+num.get(arr[i]));
        }
    }
}
