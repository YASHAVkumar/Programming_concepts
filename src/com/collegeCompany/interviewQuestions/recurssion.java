package com.collegeCompany.interviewQuestions;

interface Matixmovement{
     void findWaysInTwo(int cr,int cc,int n,String ans);
     void findWaysInFour(int cr,int cc,int dr,int dc,String ans,boolean vis[][]);
     void findTotaldestination(char arr[][],int cr, int cc, int dr, int dc, String ans, boolean vis[][]);


}
interface Binary extends  Matixmovement {
    void binary(int n);
}
public class recurssion implements Matixmovement, Binary {
    public int count=0;
    public void findTotaldestination(char arr[][],int cr,int cc,int dr,int dc,String ans,boolean vis[][]){
        if(cr<0||cc<0||cr>=dr||cc>=dc||vis[cr][cc]==true||arr[cr][cc]=='#')
        {
            return;
        }
        if(arr[cr][cc]=='T')
        {
            System.out.println(ans);
            count++;
            return;
        }
        //System.out.println(ans+" "+cr+cc);
        vis[cr][cc]=true;
        findTotaldestination(arr,cr-1,cc,dr,dc,ans+'T',vis);
        findTotaldestination(arr,cr+1,cc,dr,dc,ans+'D',vis);
        findTotaldestination(arr,cr,cc-1,dr,dc,ans+'L',vis);
        findTotaldestination(arr,cr,cc+1,dr,dc,ans+'R',vis);
         vis[cr][cc]=false;
    }





    public void findWaysInTwo(int cr,int cc,int n,String ans){
        if(cr>n-1||cc>n-1)
        {return;}
        if(cr==n-1&&cc==n-1)
        { System.out.println(ans);return;}
        findWaysInTwo(cr+1,cc,n,ans+'V');
        findWaysInTwo(cr,cc+1,n,ans+'H');
    }
    public void findWaysInFour(int cr,int cc,int dr,int dc,String ans,boolean vis[][]){

       if(cr<0||cc<0||cr>=dr||cc>=dc||vis[cr][cc]==true)
           return;
        if(cr==dr-1&&cc==dc-1)
        { System.out.println(ans); return;}
       // System.out.println(ans);
        vis[cr][cc]=true;
       findWaysInFour(cr-1,cc,dr,dc,ans+"T",vis);
        findWaysInFour(cr+1,cc,dr,dc,ans+"D",vis);
        findWaysInFour(cr,cc+1,dr,dc,ans+"R",vis);
        findWaysInFour(cr,cc-1,dr,dc,ans+"L",vis);

    }

    public void balancedBrackets(String str, int n, int c1, int c2) {
        if(c1==n&&c2==n)
        {
            System.out.println(str);
            return;}

        if(c1<n)
        {
            balancedBrackets(str+"(",n,c1+1,c2);}
         if(c1>c2)
        {
            balancedBrackets(str+")",n,c1,c2+1);
        }

    }

    public void subsequecne(String str)
    {

        System.out.println();
    }


    @Override
    public void binary(int n) {
        if(n==0)
            return;

        binary(n>>1);
        System.out.printf("%d",n%2);
    }
    public  int bin(int n)
    {
        if(n==0||n==1)
            return n;
        return bin(n>>1)*10+n%2;
    }
}
