/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author James
 */
public class BinarySearchTree {
    BSTNode root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    public void Insert(int value) {
        root = InsertRec(root,value);
    }
    
    public BSTNode InsertRec(BSTNode root, int value) {
        if (root == null) {
            return root = new BSTNode(value);
        }
        else {
            if (root.value > value) {
                root.left = InsertRec(root.left,value);
            }
            if (root.value < value) {
                root.right = InsertRec(root.right,value);
            }
        }
        return root;
    }
    
    public int Search(int data) {
        BSTNode pointer = root;
        if (pointer.value == data) {
            System.out.println("Value was found");
            return 0;
        }
        else {
            while (pointer != null) {
                if (pointer.value > data) {
                    if (pointer.left == null) {
                        break;
                    }
                    pointer = pointer.left;
                }
                if (pointer.value < data) {
                    if (pointer.right == null) {
                        break;
                    }
                    pointer = pointer.right;
                }
                if (pointer.value == data) {
                    System.out.println("Value " + data + " was found.");
                    return 0;
                }
            }
        }
        
        System.out.println("Value was not found");
        return 1;
    }
    
    public void Inorder() {
        InorderRec(root);
    }
    
    public void InorderRec(BSTNode root) {
        if (root != null) {
            InorderRec(root.left);
            System.out.println(root.value);
            InorderRec(root.right);
        }
    }
}
