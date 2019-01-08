/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author James
 */
public class StackNode {
    StackNode next;
    StackNode prev;
    int data;
    public StackNode(int value) {
        next = prev = null;
        data = value;
    }
}
