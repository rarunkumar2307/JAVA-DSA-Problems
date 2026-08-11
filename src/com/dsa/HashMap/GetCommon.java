package com.dsa.HashMap;
import java.util.HashMap;

public class GetCommon {
    public static void main(String[] args){
        int[] arr1={1,3,6,2,5,8,63,54};
        int[] arr2={5,6,9,12,54,2,3};
        common(arr1,arr2);

    }
    public static void common(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> num=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            num.put(arr1[i],1);
        }
        int j=0;
        for(int res:num.keySet()){
            if(j<arr2.length) {
                if (num.containsKey(arr2[j])) {
                    System.out.println(arr2[j]);
                    j++;
                } else j++;
            }
        }
    }
}
