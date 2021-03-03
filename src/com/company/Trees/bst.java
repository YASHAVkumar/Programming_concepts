package com.company.Trees;

public class bst
{
    static  void bst(int arr[],TreeNode root,int i)
    {
        if(i>=arr.length ||arr.length==0)
            return;

        if(arr[i]<root.getData())
        {  root.leftChild=new TreeNode(arr[i]);
            bst(arr,root.leftChild,i+1);
        }else {
            root.rightChild=new TreeNode(arr[i]);
            bst(arr,root.rightChild,i+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,5,1,7,40,50};
        TreeNode root=new TreeNode(10);

           bst(arr,root,1);
        //System.out.println(new depthOfTree().maxDepth(root));
        System.out.println(new diameterOfTree().diameterOfTree(root));
           //traversal(root);
    }

    private static void traversal(TreeNode root) {
        if(root==null)
            return;
        System.out.println(root.getData()+" ");
        traversal(root.leftChild);
        traversal(root.rightChild);
    }
}
