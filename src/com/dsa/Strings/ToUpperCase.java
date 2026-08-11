package com.dsa.Strings;

public class ToUpperCase {
    public static void main(String[] args){
        String st="HelloWoRld";
        char[] ch=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=(char)(ch[i]+'A'-'a');
            }
        }
        System.out.println(ch);
    }
}
