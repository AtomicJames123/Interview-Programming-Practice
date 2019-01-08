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
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackArray StackArray = new StackArray();
        //StackArray.push(5);
        //StackArray.push(7);
        //StackArray.push(8);
        //System.out.println(StackArray.top());
        //StackArray.push(9);
        //System.out.println(StackArray.pop());
        //System.out.println(StackArray.pop());
        //System.out.println(StackArray.pop());
        //System.out.println(StackArray.pop());
        //System.out.println(StackArray.pop());
        
        StackList StackList = new StackList();
        StackList.peek();
        StackList.push(5);
        StackList.push(7);
        StackList.push(9);
        StackList.pop();
        StackList.pop();
        System.out.println(StackList.peek());
        
        
        
    }
    
}
