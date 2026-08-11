package com.dsa.Sorting;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class ArraysSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr);
        for(int res:arr) {
            System.out.print(res + " ");
        }
        System.out.println();

        ArrayList<Integer> arr2=new ArrayList<>(java.util.List.of(7,6,5,4,3,2,45,56));
        Collections.sort(arr2);
        System.out.print(arr2+" ");
    }
}
