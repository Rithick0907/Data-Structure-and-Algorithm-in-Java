package NonLinearDS;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }

        @Override
        public String toString(){
            return "Node = " + data;
        }
    }
    private Node root;

    public void insert(int data){
        Node node = new Node(data);
        if(this.root == null){
            this.root = node;
            return;
        }
        Node current = this.root;
        while(current != null){
            if(data > current.data){
                if(current.right == null){
                    current.right = node;
                    break;
                }
                current = current.right;
            }else if(data < current.data){
                if(current.left == null){
                    current.left = node;
                    break;
                }
                current = current.left;
            }
        }
    }

    public boolean find(int data){
        Node curr = this.root;

        while(curr != null){
            if(curr.data < data)   curr = curr.right;
            else if(curr.data > data) curr = curr.left;
            else return true;
        }

        return false;
    }

    public void preorder(Node root){
        if(root == null)    return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        if(root == null)    return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void postorder(Node root){
        if(root == null)    return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    private boolean isLeaf(Node root){
        if(root.left == null && root.right == null) return true;
        return false;
    }

    public void swapNode(){
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public int height(){
        return height(this.root);
    }
    private int height(Node root){
        if(root == null)    return -1;
        if(isLeaf(root))     return 0;

        return 1 + Math.max(height(root.left),height(root.right));
    }

    public List<Integer> getNodeAtKDistance(int distance){
        List<Integer> list = new ArrayList<>();
        getNodeAtKDistance(this.root,distance,list);
        return list;
    }

    public void getNodeAtKDistance(Node root,int distance,List<Integer> list){
        if(root == null) return;

        if(distance == 0){
            list.add(root.data);
            return;
        }

        getNodeAtKDistance(root.left,distance - 1,list);
        getNodeAtKDistance(root.right,distance - 1,list);
    }

    public void levelOrderTraversal(){
        for(int i = 0; i <= height(); i++){
            var list = getNodeAtKDistance(i);
            System.out.println(list);
        }
    }

    public int min(){
        return min(this.root);
    }

    // This implementation is for Binary Tree No BST. For BST only traverse to left child until you reach leaf.
    private int min(Node root){
        if(isLeaf(root))
            return root.data;
        var left = min(root.left);
        var right = min(root.right);
        return Math.min(Math.min(left,right),root.data);
    }

    public boolean isBST(){
        return isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean isBST(Node root,int min,int max){
        if(root == null)    return true;
        if(root.data < min || root.data > max) return false;

        return
            isBST(root.left,min,root.data-1)
                && isBST(root.right,root.data+1,max);
    }

    public boolean equals(Node root){
        if(root == null)    return false;
        return equals(this.root,root);
    }
    private boolean equals(Node first, Node second){
        if(first == null && second == null) return true;
        if(first != null && second != null)
            return first.data == second.data && equals(first.left,second.left) && equals(first.right,second.right);
        return false;
    }

}
