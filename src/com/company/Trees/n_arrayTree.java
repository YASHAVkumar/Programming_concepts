package com.company.Trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class  TreeNodes{
    int value;
  ArrayList<TreeNodes> childerns=new ArrayList<>();

    public TreeNodes(int value) {
        this.value = value;
    }
}

public class n_arrayTree {
  private static class Traversal
    {
        void traversal(TreeNodes root)
        {
            if(root==null)
            {return;}
            for(var str:root.childerns)
            {
                System.out.println(str.value);
                traversal(str);
            }
           // System.out.println(root.value);
        }
        void levelOrder(TreeNodes root)
        {
            Queue<TreeNodes> obj=new LinkedList<>();
            obj.add(root);
            while(!obj.isEmpty())
            {    int size=obj.size();
                for(int i=0;i<size;i++)
                {
                     TreeNodes front=obj.remove();
                    System.out.print(front.value+" ");

                    for(var j:front.childerns)
                        obj.add(j);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        TreeNodes root =new TreeNodes(1);

            root.childerns.add(new TreeNodes(2));
        root.childerns.add(new TreeNodes(3));
        root.childerns.add(new TreeNodes(4));

        root.childerns.get(0).childerns.add(new TreeNodes(4));
        root.childerns.get(0).childerns.add(new TreeNodes(5));

        root.childerns.get(1).childerns.add(new TreeNodes(7));
        root.childerns.get(1).childerns.add(new TreeNodes(8));
        root.childerns.get(1).childerns.add(new TreeNodes(9));

        n_arrayTree.Traversal obj=new n_arrayTree.Traversal();
         //obj.traversal(root);
        obj.levelOrder(root);


    }
}
