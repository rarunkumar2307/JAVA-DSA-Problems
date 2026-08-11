package com.dsa.Recursion;

public class Sum {
    public static void main(String[] args){
        int n=5;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==1) return 1;

        int sumof =sum(n-1);//sum(4)
        return n+sumof;
    }
}
