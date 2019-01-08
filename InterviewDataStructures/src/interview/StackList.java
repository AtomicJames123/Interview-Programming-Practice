/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author James
 */
public class StackList {
    static StackNode top;
    static StackNode previousTop;
    
    public StackList() {
        top = null;
        previousTop = null;
    }
    
    public void push(int value) {
        StackNode newNode = new StackNode(value);
        if (top == null) {
            top = newNode;
        }
        else {
            top.next = newNode;
            previousTop = top;
            top = newNode;
        }
    }
    
    public int peek() {
        return top.data;
    }
    
    public int pop() {
        
        int value = top.data;
        top = previousTop;
        top.next = null;
        return value;
    }
    
}
