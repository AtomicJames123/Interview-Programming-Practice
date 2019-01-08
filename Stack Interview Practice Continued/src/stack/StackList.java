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
public class StackList {
    StackNode top;
    
    public StackList() {
        top = null;
    }
    public boolean isEmpty() {
        return (top == null);
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        else {
            return (top.data);
        }
    }
    
    public void push(int value) {
        StackNode newNode = new StackNode(value);
        if (isEmpty()) {
            top = newNode;
        }
        
        top.next = newNode;
        newNode.prev = top;
        top = newNode;
    }
    
    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        else {
            int data = top.data;
            top = top.prev;
            top.next = null;
            return data;
        }
    }
    
    //peek, pop, push
}
