package com.dsa.Array;

public class TransposeOfMatrix {
    public static void main(String[] args)throws Exception{
        int arr[][]={{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
                Thread.sleep(500);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
                Thread.sleep(500);
            }
            System.out.println();
        }
        System.out.println();

        //USING TEMP -- upper triangle
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
                Thread.sleep(500);
            }
            System.out.println();
        }
    }
}
