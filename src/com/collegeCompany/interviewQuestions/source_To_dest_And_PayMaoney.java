package com.collegeCompany.interviewQuestions;

public class source_To_dest_And_PayMaoney {
    //use dp for repeat paths
   //22-00
    static int min=10000;
    static  String str="";
    static void souceToDest(int cr,int cc,int n,String ans,int arr[][]){

        if(cr<0||cc<0)
        {return;}
        if(cr==0&&cc==0)
        {
            System.out.println(ans);
            if(n<min)
            { min=n+arr[cc][cc];str=ans;}
             return;
        }

        souceToDest(cr-1,cc,n+arr[cr][cc],ans+" "+arr[cr][cc],arr);  //up
        souceToDest(cr,cc-1,n+arr[cr][cc],ans+" "+arr[cr][cc],arr);  //left
    }

    static int souceToDest1(int cr,int cc,String ans,int arr[][]){


        if(cr==0&&cc==0)
        {
            System.out.println(ans+" ");
            return arr[0][0];
        }
         if(cr==0)
             return souceToDest1(cr,cc-1,ans,arr)+arr[cr][cc];
        if(cc==0)
            return souceToDest1(cr-1,cc-1,ans,arr)+arr[cr][cc];

        int up=souceToDest1(cr,cc-1,ans+" U "+arr[cr][cc],arr);  //up

       int left=souceToDest1(cr-1,cc,ans+" V "+arr[cr][cc],arr);  //left

        return  Math.min(up,left)+arr[cc][cc];
    }

    public static void main(String[] args) {
        int arr[][]={{1,3,1},{1,5,1},{4,2,1}};
       // souceToDest(2,2,0," ",arr);
        System.out.println( souceToDest1(2,2,"",arr));

    }
}
