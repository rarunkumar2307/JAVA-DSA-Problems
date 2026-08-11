package com.dsa.Strings;

public class ToLowerCase {
    public static void main(String[] args){
        String st="heLloWorlD";
        tolower(st);
    }
    public static void tolower(String st){
        char[] c=st.toCharArray();
        for(int i=0;i<c.length;i++){//Also i<st.length()
            if(c[i]>='A' && c[i]<='Z'){
                c[i]=(char)(c[i]+'a'-'A');
            }
        }
        System.out.println(c);
    }
}
