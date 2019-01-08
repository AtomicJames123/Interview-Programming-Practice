/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author Owner
 */
public class BinaryTree {
    //search
    //insertion
    //deletion
    BinaryNode root;
    //int size = 0;
    public BinaryTree() {
        root = null;
        //size++;
    }
    
    public void Insert(int value) {
        root = Insertion(root, value);
    }

    public BinaryNode Insertion(BinaryNode root,int value) {
        if (root == null) {
            return root = new BinaryNode(value);
        }
        if (root.data > value) {
            root.left = Insertion(root.left,value);
        }
        if (root.data < value) {
            root.right = Insertion(root.right,value);
        }
        
        return root;
        
    }
    
    public int Search(int value) {
        BinaryNode pointer = root;
        while (pointer != null) {
            if (pointer.data > value) {
                if (pointer.left == null) {
                    break;
                }
                pointer = pointer.left;
            }
            if (pointer.data < value) {
                if (pointer.right == null) {
                    break;
                }
                pointer = pointer.right;
            }
            if (pointer.data == value) {
                System.out.println("Value was found");
                return 1;
            }
        }
        
        System.out.println("Value could not be found");
        return 0;
    } 
    
    public void Inorder() {
        InorderRec(root);
    }
    
    public void InorderRec(BinaryNode root) {
        if (root != null) {
            InorderRec(root.left);
            System.out.println(root.data);
            InorderRec(root.right);
        }
    }
    
    
    
    
    
    public void PostOrder() {
        PostOrderRec(root);
    }
    
    public void PostOrderRec(BinaryNode root) {
        if (root != null) {
            PostOrderRec(root.left);
            PostOrderRec(root.right);
            System.out.println(root.data);
        }
    }
}
