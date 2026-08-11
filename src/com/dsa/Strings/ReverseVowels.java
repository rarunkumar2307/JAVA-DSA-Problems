package com.dsa.Strings;
import java.util.*;
//REVERSE THE VOWELS IN STRING

public class ReverseVowels {
    public static void main(String[] args){
        String st="NEVER GIVE UP JUST DIE";
        reverse(st);
    }
    public static void reverse(String st){
        char[] ch=st.toCharArray();
        System.out.println(ch);

        int i=0;
        int j=st.length()-1;

        while(i<j){

            while(ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U')
            {
               i++;
            }

            while(ch[j] != 'A' && ch[j] != 'E' && ch[j] != 'I' && ch[j] != 'O' && ch[j] != 'U')
            {
                j--;
            }

            if(i==j) break;

            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;

            i++;
            j--;
        }
        for(char r:ch) {
            System.out.print(r);
        }
    }
}
