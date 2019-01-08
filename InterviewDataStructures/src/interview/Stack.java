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
   int MAX = 100;
   int[] array;
   static int top;
   
   public Stack() {
       top = -1;
       array = new int[MAX];
   }
   public void isEmpty() {
       if (top == -1) {
           System.out.println("Stack is empty");
       }
       else {
           System.out.println("Stack is no empty");
       }
   }
   
   public int top() {
        return array[top];
   }
   public void push(int value) {
       if (top > MAX) {
           System.out.println("Stack is full");
       }
       top++;
       array[top] = value;
   }
   public int pop() {
       int temp = 0;
       try {
        temp = array[top];
        top--;
       }
       catch (Exception e) {
           
       }
       
       return temp;
   }
}
