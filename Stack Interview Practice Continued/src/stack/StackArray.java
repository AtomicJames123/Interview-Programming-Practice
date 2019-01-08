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
public class StackArray {
    int[] array;
    int max = 2;
    int top;
    
    public StackArray() {
        top = -1;
        array = new int[max];
    } // top, pop, push
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public int top() {
        return array[top];
    } 
    
    public void push(int value) {
        
        if (top == max - 1) {
            System.out.println("Stack is full. Value " + value + " could not be placed in stack");
            return;
        }
        else {
            top++;
            array[top] = value;
        }
    }
    
    public int pop() {
        int temp;
        if (isEmpty()) {
            System.out.println("Stack is empty");
            top = -1;
            return 0;
        }
        temp = array[top];
        top--;
        return temp;
    }
}
