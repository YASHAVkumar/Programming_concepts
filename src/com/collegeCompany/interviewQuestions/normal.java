package com.collegeCompany.interviewQuestions;

public class normal {
     public static void main(String args[])
     {
         String str="abc";
         for(int i=0;i<str.length();i++)
         {
             System.out.println(str.charAt(i));
            int j=i+1;
            while(j<str.length()){
                System.out.println(str.charAt(i)+""+str.charAt(j));
                j++;
            }
         }
         System.out.println(str);
     }
}
