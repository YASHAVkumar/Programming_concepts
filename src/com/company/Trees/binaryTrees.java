package com.company.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTrees {
   // private static Object root;

    static class Node{
        int data;
        Node left;
        Node right;
        public  Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
        Node getLeft()
        {
            return this.left;
        }
        Node getRight()
        {
            return  this.right;
        }
    }
   static Node root;

    void SetRoot(int data)
    {
      Node node=new Node(data);
       Node curr=root;
        if(curr==null)
            root=node;

    }
    void SetLeft(int data)
    {
        Node node=new Node(data);
        Node curr=root;
        if(curr.left==null)
            curr.left=node;
        else
        {
           root.left.left=node;
        }
        //root=curr;
    }

    void SetRight(int data)
    {
        Node node=new Node(data);
        Node curr=root;
        if(curr.right==null)
            curr.right=node;
        else
        {
          curr.right.right=node;
        }
  // root=curr;
    }



    void function(Node root)
    {
       if(root==null)
           return;
        System.out.println(root.data);
        function(root.left);
        function(root.right);
    }


  void travesal(Node root)
  {
      Node curr=root;
      function(curr);
  }
    public static void main(String[] args)
    {
       binaryTrees obj=new binaryTrees();
         obj.SetRoot(1);
          obj.SetLeft(2);
 //        obj.SetLeft(5);
//         obj.SetLeft(6);
          obj.SetRight(3);
          root.left.left=new Node(4);
          root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // obj.travesal(root);
       //  obj.levelOder(root);
       // obj.postoder(root);
       // obj.preoder(root);
       // obj.inoder(root);
       // obj.search(root,4);
        //System.out.println(new  diameterOfTree().diameterOfTree(root));
    }
   void search(Node root,int key)
   {
       if(root==null)
           return;
       if(root.data==key)
       {
           System.out.println(root+" yes"); }
       search(root.left,key);
        search(root.right,key);
   }
    void levelOder(Node root) {
        Queue<Node> q=new LinkedList();
        q.add(root);
        while(!q.isEmpty())
        { int n=q.size();
            for(int i=0;i<n;i++)
            {
                Node front=q.remove();
                System.out.print(front.data+" ");
                if(front.left!=null)
                    q.add(front.left);
                if(front.right!=null)
                    q.add(front.right);
            }
            System.out.println();
        }
    }
   void preoder(Node root)
   {    if(root==null)
           return;
       System.out.println(root.data+" ");
       preoder(root.left);
       preoder(root.right);
   }
   void inoder( Node root)
   { if(root==null)
       return;
       inoder(root.left);
       System.out.println(root.data+" ");
       inoder(root.right);

   }
    void postoder(Node root){
        if(root==null)
            return;
        postoder(root.right);
        postoder(root.left);
        System.out.println(root.data+" ");
    }

}
