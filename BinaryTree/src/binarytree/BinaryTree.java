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
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree BST = new BinarySearchTree();
        BST.Insert(3);
        BST.Insert(5);
        BST.Insert(2);
        BST.Inorder();
        BST.Search(3);
        BST.Search(6);
        BST.Search(2);
    }
    
}
