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
public class Stack {
    int max = 1000;
    int array[] = new int[max];
    int top;
    public Stack() {
        top = -1;
    }
    public int top() {
        return array[top];
    }
    public int pop() {
        int x = array[top--];
        
        return x;
    }
    public void push(int value) {
        array[top++] = value;
    }
}
