package com.dsa.HashMap;
import java.util.HashMap;

public class MaxFrequency {
    public  static void main(String[] args){
        String s="aabdabcdbacbd";
        frequency(s);
    }
    public static void frequency(String s){
        HashMap<Character,Integer> fmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(fmap.containsKey(ch)){
                int cfreq=fmap.get(ch);
                fmap.put(ch,cfreq+1);
            }else{
                fmap.put(ch,1);
            }
        }
        int maxfreq=0;
        char maxchar=' ';
        for(char res:fmap.keySet()){
            if(fmap.get(res)>maxfreq){
                maxfreq=fmap.get(res);
                maxchar=res;
            }
        }
        System.out.println(maxchar+"->"+maxfreq);
    }
}
