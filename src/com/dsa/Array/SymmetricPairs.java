package com.dsa.Array;

public class SymmetricPairs {
    public static void main(String[] args){
        int[][] arr={{1,2},{3,5},{4,5},{5,3},{2,1}};
        symmetric(arr);
        System.out.println();
    }
    public static void symmetric(int[][] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]) {
                    System.out.println("("+arr[i][1]+" "+arr[i][0]+")");
                    break;
                }
            }
        }
    }
}
