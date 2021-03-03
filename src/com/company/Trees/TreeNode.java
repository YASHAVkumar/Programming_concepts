package com.company.Trees;

public class TreeNode {
    private int data;
    private String str;
    TreeNode leftChild,rightChild;
    public TreeNode(int data)
    {
        this.data=data;
        this.leftChild=this.rightChild=null;
    }
    public TreeNode(String str)
    {
        this.str=str;
        this.leftChild=this.rightChild=null;
    }
    public TreeNode(String str,int data)
    {
        this.data=data;
        this.str=str;
        this.leftChild=this.rightChild=null;
    }

    public int getData() {
        return data;
    }

    public String getStr() {
        return str;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }
}
