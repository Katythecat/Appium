package CoreJava;

import java.util.ArrayList;

public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        //string is an object// string literal

        String s1="Leo is a cat";
        String s5="hello";

        //new
        String s2=new String("welcome");
        String s3=new String("welcome");

        String s="Leo is a cat";
        String[] spritStr=s.split("is");
        for(String st:spritStr){
            String trimme=st.trim();
            System.out.println(trimme);
            }

        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            System.out.println(c);

        }
        for (int i = s.length()-1 ; i >=0 ; i--) {
            char reverse=s.charAt(i);
            System.out.println(reverse);


        }

        }





    }


