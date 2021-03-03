package com.company.Trees.revsionTree;

/**********construction of tree, traversal,views,depth,diameter***/

import com.company.Trees.TreeNode;
import org.w3c.dom.Node;

import java.lang.reflect.Array;
import java.util.*;

public class binaryTree {
    static int depth(Nodem root)
    {
        if(root==null)
            return 0;
        int left=depth(root.left)+1;
        int right=depth(root.right)+1;
        return  Math.max(left,right);
    }
    static  int daimeter(Nodem root)
    {
        if(root==null)
            return 0;
         int lefdia=depth(root.left);
         int rightdia=depth(root.right);
         int dia=lefdia+rightdia;
         int l=daimeter(root.left);
         int r=daimeter(root.right);
         return Math.max(dia,Math.max(l,r));
    }


  static void traversal(Nodem root)  //pre in post
    {
        if(root==null)
            return;
        System.out.println(root.data);
        traversal(root.left);
        traversal(root.right);

    }
    static  void levelorder(Nodem root)
    {
        Queue<Nodem> queque=new LinkedList<>();
      if(root==null)
          return;
        queque.add(root);
        while(!queque.isEmpty())
        {
            int n=queque.size();
            for(int i=0;i<n;i++)
            {
               Nodem front=queque.remove();
                System.out.print(front.data+" ");
                if(front.left!=null)
                    queque.add(front.left);
                 if(front.right!=null)
                    queque.add(front.right);
            }
        }
    }
static  int max=0;
    static  void leftSide(Nodem root,int flag)
     {
          if(root==null)
              return;
         // flag=1;
            if(flag>max) {
                System.out.println(root.data);
            max=flag;
            }
                leftSide(root.left,flag+1 );
                leftSide(root.right,flag+1 );

    }
   static Map<Integer, ArrayList<Nodem>> map=new HashMap<>();
   static  void help_ver(Nodem root,int lvl)
   {
       if(root==null)
           return;
       ArrayList<Nodem> list=map.getOrDefault(lvl,new ArrayList<>());
       list.add(root);
       map.put(lvl,list);

       help_ver(root.left,lvl-1);
       help_ver(root.right,lvl+1);

   }
   static public void bottomView(Nodem root, int lvl)
    {
        help_ver(root,lvl);
        for(var key:map.entrySet())
        {
            if(key.getValue().size()==1)
            {
                System.out.println(key.getValue().get(0).data);
            }
            else
            {
                System.out.println(key.getValue().get(key.getValue().size()-1).data);
            }
        }
    }
    static  void construct()
    {
        Nodem root=new Nodem(1);
        Nodem curr=root;
        root.left=new Nodem(2);
        curr=root.left;
        curr.left=new Nodem(4);
        //curr=curr.left;
        curr.left.right=new Nodem(-1);
        curr.right=new Nodem(3);
        curr=root;
        curr.right=new Nodem(4);
        curr=root.right;
        curr.left=new Nodem(8);
        curr.right=new Nodem(10);
        //traversal(root);
        //System.out.println("diameter of tree "+daimeter(root));
        //levelorder(root);
        //leftSide(root,0);
        help_ver(root,0);
       // bottomView(root,0);
    }
    public static void main(String[] args) {
      construct();       //1
                    //2        4
                 //4    3    8   10
                   //-1
        //System.out.println(map.values());
        for(ArrayList<Nodem> i:map.values())
        {
            for(var j:i)
                System.out.print(j.data+" ");
            System.out.println();
        }
    }
}
