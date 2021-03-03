package com.company.Trees;

public class diameterOfTree {
   public int diameterOfTree(TreeNode root)
    {
        if(root==null)
           return 0;
        int leftdai= new depthOfTree().maxDepth(root.leftChild);
        int rightdai= new depthOfTree().maxDepth(root.rightChild);
        int rootdai=leftdai+rightdai;
        int l=diameterOfTree(root.leftChild);
        int r= diameterOfTree(root.rightChild);
           return  Math.max(rootdai,Math.max(l,r));
    }
}
