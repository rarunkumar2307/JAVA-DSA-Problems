package com.dsa.Array;

public class CountFrequency {
    public static void main(String[] args){
        int[] arr={1,2,1,4,6,3,2,6,1,8};
        count(arr);
    }
    public static void count(int[] arr){
        boolean[] visited =new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(visited[i]) continue;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+"="+count);
        }
    }
}
