package com.dsa.Array;

public class TwoDimensionArrays {
    public static void main(String[] args) {
        int[][] arr=new int[5][5];

        //SET
        arr[0][0]=1;
        arr[0][1]=2;

        //GET
        System.out.println(arr[0][1]);

        //PRINT ROW
        System.out.println(arr.length);

        //PRINT COLUMN
        System.out.println(arr[0].length);

        //TRAVERSE
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
