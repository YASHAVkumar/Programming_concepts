package com.company.Trees.revsionTree;

import java.util.HashMap;
import java.util.Map;

class  Node<C> {
    char data;
    HashMap<Character,Node<Character>> chidren;
    boolean terminal;
    int wordCount;
    public Node(char data)
    {
        this.data=data;
        this.chidren=new HashMap<>();
       // this.wordCount=0;
    }
}
public class Tires {
  static  Node root=new Node('*');
  static   void insert(String  word)
    {
        char arr[]=word.toCharArray();

        Node curr=root;
        for(char i:arr)
        {
            if(!curr.chidren.containsKey(i))
            {   Node n=new Node(i);
                curr.chidren.put(i,n);
                curr=n;
            }
            else
            {
                curr= (Node) curr.chidren.get(i);

            }
            curr.wordCount++;
            System.out.print(curr.wordCount+" ");
        }
        System.out.println();
        curr.terminal=true;

       // System.out.print(curr.chidren);
    }

  static void searchwordcount(String word){
        Node curr=root;
        char[] arr=word.toCharArray();
        int flag=0;
        for(char c:arr)
        {
            if(curr.chidren.containsKey(c))
            {
                curr= (Node) curr.chidren.get(c);
                //System.out.println(c+" "+curr.wordCount);
            }else
            { flag=1;
                break;
            }
        }

        if(flag==0)
            System.out.println("yes"+curr.wordCount);
    }


    static boolean searchWord(String word)
    {
       char arr[]=word.toCharArray();
       Node curr=root;
       boolean flag=false;
       for(var i:arr)
       {
           if(curr.chidren.containsKey(i))
           {

              curr= (Node) curr.chidren.get(i);
           }
           else
           {flag=false;
               break;
           }
       }

       if(curr.terminal==true)
           flag=true;


      return flag;
    }
    public static void main(String[] args) {
         insert("hack");
         insert("hackerank");
         insert("car");
         insert("hash");
         searchwordcount("k");
        //System.out.println(searchWord("ca"));

//        System.out.println(root.data);
//       for(var itr:root.chidren.keySet())
//       {
//           System.out.println(itr);
//       }
    }
}
