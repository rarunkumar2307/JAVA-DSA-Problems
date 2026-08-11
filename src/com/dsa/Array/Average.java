package com.dsa.Array;

public class Average {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        double sum=0;
        for(int res:arr) sum+=(double)res;
        if(sum==(int)sum){
            System.out.println("SUM: "+(int)sum);
        }else{
            System.out.println("SUM: "+sum);
        }
        double avg=sum/arr.length;
        System.out.println("AVG: "+avg);
    }
}
