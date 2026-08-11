package com.dsa.Strings;

public class RemoveVowels {
    public static void main(String[] args){
        String st="I WILL DO IT BY MYSELF";
        removeVowels(st);
    }
    public static void removeVowels(String st){
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if(c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U'){
                System.out.print(c);
            }
        }
    }
}
