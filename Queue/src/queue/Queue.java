/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author James
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueueList List = new QueueList();
        List.InsertTail(3);
        List.InsertTail(7);
        //List.InsertTail(9);
        //List.InsertTail(12);
        
        List.PrintList();
        
        //System.out.println(List.size);
        //System.out.println(List.DeleteHead());
        //System.out.println(List.DeleteHead());
        //System.out.println(List.DeleteHead());
        //System.out.println(List.DeleteHead());
        //System.out.println(List.head.value);
        //System.out.println(List.size);
        //List.InsertHead(9);
        //List.DeleteHead();
        //List.Print();
    }
    
}
