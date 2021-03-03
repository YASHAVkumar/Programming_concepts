package com.collegeCompany.interviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _01knapsack {
    static  int max=Integer.MIN_VALUE;
    /******************naive approch*********************************/
    private static void knapsack(int item[],int weight[],int n,int c,String ans,int capacity,int w)
    {
        if(n<0)
        {
            if(c<capacity && w>max)
            {//System.out.println(ans+" "+c+"="+w);
                max=w;}
            return ;
        }
        knapsack(item,weight,n-1,c+item[n],ans+item[n]+"="+weight[n]+"=> ",capacity,w+weight[n]);
        knapsack(item,weight,n-1,c,ans,capacity,w);

    }
    /****************Dynamic Approch************/
    private static  int itzz0_1knapsack(int item[],int weight[],int n,int capacity)
    {
        int arr[][]=new int[n+1][capacity+1];
        for (int i=0;i<=n;i++)
        {
            for(int j=0;j<=capacity;j++)
            {
                if(i==0||j==0)
                    arr[i][j]=0;
                else  if(item[i-1]<=j)
                {
                    arr[i][j]=Math.max(weight[i-1]+arr[i-1][j-item[i-1]],arr[i-1][j]);
                }
                else
                    arr[i][j]=arr[i-1][j];
            }
        }
        for(int i=0;i<=n;i++)
        { for(int j=0;j<=capacity;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();}

        return  arr[n][capacity];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=sc.nextInt();
        int item[]=new int[n+1],weight[]=new int[n+1];
       // HashMap<Integer,Integer> map=new HashMap<>();
      // int item[]={1,2,2,2,3};
        //int weight[]={8,4,5,3,0};
        for(int i=1;i<=n;i++)
        {
            item[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            weight[i]=sc.nextInt();
        }
        //knapsack("12322","84053",n-1,c,"");
        //knapsack(item,weight,n-1,0,"",c,0);


       // Arrays.sort(item);

        int max=itzz0_1knapsack(item,weight,n,c);
        System.out.println(max);
    }


    private static void knapsack(String str,String weight,int n,int c,String ans) {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        //if(item[n]<c)

         knapsack(str.substring(1),weight.substring(1),n-1,c,ans+str.charAt(0)+"="+weight.charAt(0)+" ");
         knapsack(str.substring(1),weight.substring(1),n-1,c,ans);

    }
}
