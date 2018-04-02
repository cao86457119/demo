package com.example.demo;

public class hh {
    public  static void main(String... args){
        String s="bbb  !!!";
        char[] chars = s.toCharArray();
        StringBuffer sbf = new StringBuffer();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='z') {
                sbf.append('a');
                continue;
            }
            if(chars[i]=='Z') {
                sbf.append('A');
                continue;

            }
            if(chars[i]>='A'&&chars[i]<'Z'){
                char temp = (char) (chars[i]+1);
                sbf.append(temp);
                continue;
            }

            if(chars[i]>='a'&&chars[i]<'z'){
                char temp = (char) (chars[i]+1);
                sbf.append(temp);
                continue;
            }
            else
            {
                sbf.append(chars[i]);
                continue;
            }
        }
        System.out.println(sbf.toString());
    }
}
