package com.collegeCompany.interviewQuestions;

import java.util.Scanner;

public class StringmaxfrequencyChar {
       private  static char function(char ch[])
       {
           int freq[]=new int[26];
           for (int i=0;i<ch.length;i++) {
            int index=ch[i]-'a';
               freq[index]++;
           }
           int max=Integer.MIN_VALUE;
           int j=0;
           for (int i=0;i<26;i++)
               if(freq[i]>max)
               {max=freq[i];j=i;}

           return (char)(j+'a');
       }

       /*************using recurrsion***************/
       private  static  int maxOccur(char ch,String str,int j,int count)
       {
         if (j<str.length()) {
             if (str.charAt(j) == ch)
                 count++;
             maxOccur(ch, str, j + 1, count);
         }
           return count;
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       // System.out.println(function(str.toCharArray()));
        int f=Integer.MIN_VALUE;
        for (int i=0;i<str.length();i++)
        { int max=maxOccur(str.charAt(i),str,i+1,0);


        System.out.println(max);
        }
    }
}
