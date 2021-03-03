package com.collegeCompany.interviewQuestions;

import java.util.Scanner;
//take 1 or 2 at a time
public class climbingStair {
    private static int stair(int n,int count)
    {
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        int c=stair(n-1,count);
        int x=stair(n-2,count);
        return c+x;
    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( stair(n,0));
    }
}
