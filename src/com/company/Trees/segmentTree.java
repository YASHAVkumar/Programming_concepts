package com.company.Trees;   //it's not binary tree

public class segmentTree {

/*
   static class sNode{
        int min;
        sNode left,right;
        public sNode(int data)
        {
            min=data;
            left=right=null;
        }
    }
     static int minimun(int arr[],int left,int right)
    {
        int m= Integer.MAX_VALUE;
        for (int i=left;i<right;i++)
            if(arr[i]<m)
                m=arr[i];
        System.out.println(m);
            return m;
    }
    static  void insert(int arr[],int left,int right)
    {
        if(left>right)
        {
            return;
        }
            int mid=(left+right)/2;
        System.out.println(mid+" "+left+" "+right);
            insert(arr,left,mid);
           insert(arr,mid+1,right);

    }

 */
    public static  void build(int input[],int segement[],int left,int right,int ci)
    {
        if(left==right)
        {  segement[ci]=input[left];
           // System.out.println(left+" "+right+" "+ci+" "+segement[ci]+" "+input[left]+" "+input[right]);
        return;
        }

        int mid=(left+right)/2;
        build(input,segement,left,mid,2*ci);
        build(input,segement,mid+1,right,2*ci+1);
       segement[ci]=Math.min(input[left],input[right]);
      // System.out.println(left+" "+right+" "+ci+" "+segement[ci]+" "+input[left]+" "+input[right]);
    }

    public static void main(String[] args) {
        int arr[]={0,1,5,2,-3,4,-1};
        int segment[]=new int[4*arr.length];

      build(arr,segment,1,6,1);
      for (int i=0;i<segment.length;i++)
          if(segment[i]!=0)
          System.out.print(segment[i]+" ");
    }
}
