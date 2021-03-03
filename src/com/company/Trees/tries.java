package com.company.Trees;

import java.util.HashMap;
import java.util.Map;

class Node{
    char data;
    boolean terminal;
    Map<Character,Node>children;
    int count;
    public  Node(char data)  //n-array tree use Collection hashmap..
    {
        this.data=data;
        this.terminal=false;
        this.children=new HashMap<>();
       this.count=1;
     }
}
public class tries {
    Node root;
    public tries()
    {
        root=new Node('*');
    }
    public void insert(String word)
    {
        Node curr=root;
        char[] arr=word.toCharArray();
        for(char i:arr)   //check
        {
            if(curr.children.containsKey(i))
            {
                curr=curr.children.get(i);
                curr.count++;
            }else
            {
                Node obj=new Node(i);
                //connection to root
                curr.children.put(i,obj);
                curr=obj;

            }
        }
        //cruu=j
        curr.terminal=true;
        System.out.println(curr.children);
    }

    int  search(String word){
        Node curr=root;
        char[] arr=word.toCharArray();
        int flag=0;
        for(char c:arr)
        {
            if(curr.children.containsKey(c))
            {
               curr= curr.children.get(c);
              //  System.out.println(c+" "+curr.terminal);
            }else
            { flag=1;
                break;
            }
        }
        //check kro ye shaded  ha ki ni
        if(curr.terminal==true)
            flag=2;
         System.out.println(curr.terminal+" "+flag+" "+curr.data);
        return  flag;
    }
    int  searchwith(String word){
        Node curr=root;
        char[] arr=word.toCharArray();
        int flag=0;
        for(char c:arr)
        {
            if(curr.children.containsKey(c))
            {
                curr= curr.children.get(c);
               // System.out.println(c+" "+curr.terminal);
            }else
            { flag=1;
                break;
            }
        }
        //check kro ye shaded  ha ki ni

        //   System.out.println(curr.terminal+" "+flag+" "+curr.data);
        return  flag;
    }
    void searchwordcount(String word){
        Node curr=root;
        char[] arr=word.toCharArray();
        int flag=0;
        for(char c:arr)
        {
            if(curr.children.containsKey(c))
            {
                curr= curr.children.get(c);
                 System.out.println(c+" "+curr.count);
            }else
            { flag=1;
                break;
            }
        }

       if(flag==0)
           System.out.println("yes"+curr.count);
    }
    public static void main(String args[])
    {
       tries t=new tries();
       t.insert("hack");
       t.insert("hackerrank");
       t.insert("car");
       t.insert("hash");
       // t.insert("hac");
        int a=t.search("car");
       // System.out.println(a);
        //t.searchwith("hac");
        //t.searchwordcount("hac");
    //   if(r==0)
          // System.out.println("yes");
      // else
     //      System.out.println("No");
    }
}
