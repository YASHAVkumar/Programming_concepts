package com.company.Trees;

public  class rightSideViewofTree {
    static int max=0;
  //  static int lvl=1;
  public static void leftSideOfTree(TreeNode root,int lvl)
  {
      if(root==null)
          return;
      if(lvl>max)
      {System.out.println(root.getData());max=lvl;}
      rightSideOfTree(root.leftChild,lvl+1);
      rightSideOfTree(root.rightChild,lvl+1);

  }
    public static void rightSideOfTree(TreeNode root,int lvl)
    {
        if(root==null)
            return;
        if(lvl>max)
        {System.out.println(root.getData());max=lvl;}
       rightSideOfTree(root.rightChild,lvl+1);
       rightSideOfTree(root.leftChild,lvl+1);
    }

   static void traversal(TreeNode root)
    {
        if(root==null)
            return;
        System.out.println(root.getData());
        traversal(root.leftChild);
        traversal(root.rightChild);
    }
    public static void main(String[] args) {

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
       // traversal(root);
       // rightSideOfTree(root,0);
        //leftSideOfTree(root,0);
    }
}
