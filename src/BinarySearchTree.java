package com.test.app;

/**
 * Is a binary tree in symmetric order
 * Symmetric order - Opposite to binary heap (where the parent was greater than its children)
 * Here every node is
 *  1) Greater than all keys to the Left subtree
 *  2) Smaller to all keys to the Right subtree
 *
 *  Get and Put are logN implementation, but Put is recursive (Tricky as it returns the parent)
 */
public class BinarySearchTree {
    Integer[] arr = {10, 40, 50, 60, 30, 90, 70, 00 , 20, 80, 110, 00};

    Node root;

    public Integer get(Integer key){
        Node x = root;

        while(x != null){
            int cmp = key.compareTo(x.key);
            if(cmp<0) x = x.left;
            else if(cmp>0) x = x.right;
            else return x.value;
        }
        return null;
    }

    public void put(Integer key, Integer value){
        if(key == null) return;
        root = put(root, key, value); // root can change, so important to return
    }

    private Node put(Node node, Integer key, Integer value){
        if(node == null) return new Node(key, value);

        int cmp = key.compareTo(node.key);
        if(cmp <0) node.left = put(node.left, key, value);
        else if(cmp>0) node.right = put(node.right, key, value);
        else node.value = value;

        return node;
    }

    public void prepBST(BinarySearchTree binarySearchTree){
        for(int i = 0; i < arr.length; i++){
            binarySearchTree.put(i, arr[i]);
            //System.out.println(i + "" + arr[i]);
        }

    }

    /**
     * Traverse in Order of the binary tree - left first, then node, right node
      */
    public void visitInOrder(Node node){
        if(node != null){
            visitInOrder(node.left);
            System.out.println("Node: "+node);
            visitInOrder(node.right);
        }
    }

    /**
     * Traverse in Pre Order of the binary tree - Node first, then left, right node
     * Root is always the first
     */
    public void visitPreOrder(Node node){
        if(node != null){
            System.out.println("Node: "+node);
            visitPreOrder(node.left);
            visitPreOrder(node.right);
        }
    }

    /**
     * Traverse in Post Order of the binary tree - left first, right node, then node
     * Root is always the last
     */
    public void visitPostOrder(Node node){
        if(node != null){
            visitPostOrder(node.left);
            visitPostOrder(node.right);
            System.out.println("Node: "+node);
        }
    }

    private class Node{
        Integer key, value;
        Node left, right;

        Node(Integer key, Integer value){
            this.key = key;
            this.value = value;
        }
    }
}
