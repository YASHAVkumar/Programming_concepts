package com.collegeCompany.interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class coinChange {
    static  int ways=0;
    private  static  void coinchange(int arr[],int n,int target,String ans)
    {
         if(target==0)
         {ways++;
             System.out.println(ans);return;}
       // System.out.println(ans);
        if(target<0)
            return;
       for (int i=0;i<n;i++)
         coinchange(arr,n,target-arr[i],ans+arr[i]);

    }
    /***********************knopshak algo (include and exclude)********************/
    private  static  int distinctWays(int arr[],int n,int target,String ans)
    {
        if(target==0)
        {
           // System.out.println(ans);
            return 1;
        }
        if(n<0||target<0)
            return 0;
        int include=distinctWays(arr,n,target-arr[n],ans+arr[n]);
        int exclude=distinctWays(arr,n-1,target,ans);
        return include+exclude;
    }
    private  static  int distinctWaysUsingDp(int arr[],int n,int target,String ans,HashMap<String,Integer> map)   //Using DP to store keys
    {
        if(target==0)
        {
             //System.out.println(ans+" "+map);
            return 1;
        }
        if(n<0||target<0)
            return 0;
        String key=target+"#"+n;
        if(!map.containsKey(key))
        { int include=distinctWaysUsingDp(arr,n,target-arr[n],ans+arr[n],map);
        int exclude=distinctWaysUsingDp(arr,n-1,target,ans,map);
        map.put(key,include+exclude);
        }

        return map.get(key);
    }

    /***************itrative approch***********/
    static long countWays(int S[], int m, int n)
    {

        long[] table = new long[n+1];

        Arrays.fill(table, 0);

        table[0] = 1;


        for (int i=0; i<m; i++) {
            for (int j = S[i]; j <= n; j++) {
                table[j] += table[j - S[i]];
                System.out.println(table[j] + " " + j+" "+S[i]);
            }
            System.out.println();
        }
        return table[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
       // coinchange(arr,n,target,"");
        //int ways=distinctWays(arr,n-1,target,"");
        HashMap<String,Integer> map=new HashMap<>();
      // int way= distinctWaysUsingDp(arr,n-1,target,"",map);
        long way=countWays(arr,n,target);
        System.out.println(way);
    }
}
