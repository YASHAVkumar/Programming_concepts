package com.company.Trees;

public  class depthOfTree {
     public int maxDepth(TreeNode root)
     {
         if(root==null)
             return 0;
          // if(root.leftChild!=null)
         int n=maxDepth(root.leftChild);
         int num=maxDepth(root.rightChild);
       return Math.max(n,num)+1;
     }
}
