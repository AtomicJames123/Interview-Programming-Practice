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
public class BSTNode {
    BSTNode left;
    BSTNode right;
    int value;
    
    public BSTNode(int data) {
        left = right = null;
        value = data;
    }
}
