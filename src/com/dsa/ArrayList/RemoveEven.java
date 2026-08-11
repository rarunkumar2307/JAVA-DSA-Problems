package com.dsa.ArrayList;
import java.util.ArrayList;

public class RemoveEven {
    public static void main(String[] args){

        ArrayList<Integer> list=
                new ArrayList<>(java.util.List.of(2,5,7,8,19,45,97,34,46));
        System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println(list);

        //OR

        ArrayList<Integer> list2=
                new ArrayList<>(java.util.List.of(2,5,7,8,19,45,97,34,46));
        System.out.println(list2);
        list2.removeIf(n -> n%2!=0);//Remove odd
        System.out.println(list2);
    }
}
