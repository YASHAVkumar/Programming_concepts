package com.company.Trees;

import javax.swing.text.View;
import java.util.*;
class ViewOfTree{

   private static Map<Integer,ArrayList<TreeNode>> map=new TreeMap<>();
     private void vertical_HelpingView(TreeNode root, int lvl)
    {
        if(root==null)
            return;
//        if(map.containsKey(lvl))
//        {
//            ArrayList str=map.get(lvl);
//            str.add(root);
//            map.put(lvl,str);
//        }else
//        {
//            //   String str1=""+root.getData();
//            ArrayList obj=new ArrayList();
//            obj.add(root);
//            map.put(lvl,obj);
//        }

           ArrayList list=map.getOrDefault(lvl,new ArrayList<>());
                 list.add(root);
                 map.put(lvl,list);

        vertical_HelpingView(root.leftChild,lvl-1);
        vertical_HelpingView(root.rightChild,lvl+1);
    }
    public  void verticalView(TreeNode root,int lvl)
    {
        vertical_HelpingView(root,lvl);
        System.out.println(map.entrySet());
        for(var ket:map.entrySet()) {
            for(var list:ket.getValue())
            System.out.print(list.getData()+" ");
            System.out.println();
        }

    }

     public void topView(TreeNode root,int lvl)
    {
        vertical_HelpingView(root,lvl);

        for(var o:map.entrySet())
        {
            System.out.println(o.getValue().get(0).getData());
        }
    }
    public void bottomView(TreeNode root,int lvl)
    {
        vertical_HelpingView(root,lvl);
        for(var key:map.entrySet())
        {
            if(key.getValue().size()==1)
            {
                System.out.println(key.getValue().get(0).getData());
            }
            else
            {
                System.out.println(key.getValue().get(key.getValue().size()-1).getData());
            }
        }
    }

    private static  int max=-1;
    public void rightView(TreeNode root,int lvl)
    {
        if(root==null)
            return;
        if(lvl>max)
        {  System.out.println(root.getData());max=lvl;}
        rightView(root.rightChild,lvl+1);
        rightView(root.leftChild,lvl+1);
    }

    public void leftView(TreeNode root,int lvl)
    {
        if(root==null)
            return;
        if(lvl>max)
        {  System.out.println(root.getData());max=lvl;}
        rightView(root.leftChild,lvl+1);
        rightView(root.rightChild,lvl+1);

    }
}

public class topViewofTree {


    public  static  void main(String args[])
    {
        TreeNode root=new TreeNode(1);
        TreeNode curr=root;
        curr.leftChild=new TreeNode(2);
        curr=curr.leftChild;
        curr.leftChild=new TreeNode(3);
        curr=curr.leftChild;
        curr.leftChild=new TreeNode(4);

        curr=root;

        curr.rightChild=new TreeNode(5);
        curr=curr.rightChild;
        curr.rightChild=new TreeNode(6);
        curr=curr.rightChild;
        curr.leftChild=new TreeNode(9);
        curr.rightChild=new TreeNode(8);
        curr=curr.rightChild;
        curr.leftChild=new TreeNode(7);
     //   ArrayList<TreeNode> obj=new ArrayList<>();
        ViewOfTree obj=new ViewOfTree();
        // obj.verticalView(root,0);
          //obj.topView(root,0);
          //  obj.bottomView(root,0);
          //obj.rightView(root,0);
          obj.leftView(root,0);

    }
}
