//Remove Duplicate After Sort

package com.dsa.Array;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr={1,2,3,4,1,5,6,3,2};
        Arrays.sort(arr);
        int k=remove(arr);
        System.out.println("K :"+k);
        for(int i=0;i<k;i++) System.out.print(arr[i]+" ");
        System.out.println();

        //Without Sort
        arr=new int[]{1,2,3,4,1,5,6,3,2};
        int K=remove1(arr);
        System.out.println("K :"+K);
        for(int i=0;i<K;i++) System.out.print(arr[i]+" ");

    }
    public static int remove(int[] arr){
        int k =0;
        for(int i=1;i<arr.length;i++){
            if(arr[k]!=arr[i]) {
                k++;
                arr[k]=arr[i];
            }
        }
        return k+1;
    }
    public static int remove1(int[] arr){
        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}
