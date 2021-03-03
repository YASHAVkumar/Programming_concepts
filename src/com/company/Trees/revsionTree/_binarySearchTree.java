package com.company.Trees.revsionTree;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Node;

import java.lang.reflect.Method;

/********************construction*************/

public class _binarySearchTree{

    public  static class bstOperation{

        public Nodem root=null;

        void insert(@NotNull Nodem root, int val)
        {
           if(val<root.data)
           {
               if(root.left==null)
               {
                   root.left=new Nodem(val);
               }
               else
                   insert(root.left,val);
           }
           else
           {
               if(root.right==null)
               {
                   Nodem temp=new Nodem(val);
                   root.right=temp;
               }
               else
                   insert(root.right,val);
           }
        }

        Nodem delete(Nodem root,int key)
        {
            if(root==null)
                return null;

            if(root.data==key )
            {
              if(root.left==null && root.right==null)          //leaf node
                return null;
              else if(root.left!=null && root.right!=null)    //2 child node
              {
                   root.data=minValue(root.right);              // min find in right tree
                   delete(root.right,root.data);  /******send again to find leaf node 11 ***/
              }
              else                                          //1 child node
              {
                  if(root.right!=null)
                      root=root.right;
                  else
                      root=root.left;
              }

            }
            else if(root.data>key)
            root.left=delete(root.left,key);
            else
            root.right=delete(root.right,key);
            //if(root.left!=null &&root.right!=null)
            //System.out.print(root.data+" ");
            return  root;
        }

        void minvalueIteratively(Nodem root)
        {
           if(root==null)
               return;
           int min=100;
            Nodem temp=root;
            while (temp!=null)
            {
              min=temp.data;
              temp=temp.left;
            }
            System.out.println("Min value is "+min);
        }
        int minValue(@NotNull Nodem root)
        {
            if(root.left==null)
                return root.data;

            int min=minValue(root.left);
            return min;
        }


        int search(Nodem root, int key)
        {
            if(root.data==key)
            {
              //  System.out.println("yes it is ");
                return 1;}

            if(root.data<key)
            {
                //System.out.println(search(root.right,key));
              return search(root.right,key);
            }else
            { return search(root.left,key);}

        }

        void traversal(Nodem root)
        {
            if(root==null)
                return;
            System.out.println(root.data);

            traversal(root.left);

            traversal(root.right);
        }


    }
      public static void main(String[] args) throws NoSuchMethodException {
//          construction root= new construction(11);
//          root.left=new construction(9);
//          root.left.left=new construction(-1);
//          root.left.right=new construction(10);
//          root.right=new construction(90);

           bstOperation obj=new bstOperation();

           int arr[]={6,2,9,3,8,13,5,11,18,4};
           Nodem root =new Nodem(arr[0]);
           for(int i=1;i<arr.length;i++)
           {
               obj.insert(root,arr[i]);

           }
         // System.out.println(root.left.data);
         //  obj.delete(root,9);
         // System.out.println(obj.minValue(root));
            //obj.traversal(root);
     if(obj.search(root,1)==1)
         System.out.println("yes is exist");
     else
         System.out.println("No");

      }
}
