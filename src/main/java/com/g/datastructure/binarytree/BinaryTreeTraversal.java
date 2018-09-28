package com.g.datastructure.binarytree;

import java.util.Objects;

public class BinaryTreeTraversal {
    public static void main(String[] args)
    {
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50, "Boss");

        theTree.addNode(25, "Vice President");

        theTree.addNode(15, "Office Manager");

        theTree.addNode(30, "Secretary");

        theTree.addNode(75, "Sales Manager");

        theTree.addNode(85, "Salesman 1");

        inorderTraversal(theTree.root);
    }

    public static void inorderTraversal(Node rootNode)
    {
        if(Objects.nonNull(rootNode))
        {
            inorderTraversal(rootNode.leftChild);
            System.out.println(rootNode);
            inorderTraversal(rootNode.rightChild);

        }
    }
    public static void preorderTraversal(Node rootNode)
    {
        if(Objects.nonNull(rootNode))
        {
            System.out.println(rootNode);
            inorderTraversal(rootNode.leftChild);

            inorderTraversal(rootNode.rightChild);

        }
    }
    public static void postorderTraversal(Node rootNode)
    {
        if(Objects.nonNull(rootNode))
        {
            inorderTraversal(rootNode.rightChild);
            System.out.println(rootNode);
            inorderTraversal(rootNode.leftChild);



        }
    }
}
