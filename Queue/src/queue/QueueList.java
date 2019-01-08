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
public class QueueList {
    QueueNode head;
    QueueNode tail;
    static int size;
    
    public QueueList() {
        head = null;
        size = 0;
    }
    
    public void PrintList() {
        QueueNode pointer = head;
        while (pointer.next != null) {
            System.out.print(pointer.value + ",");
            pointer = pointer.next;
        }
    }
    
    public void InsertTail(int value) {
        if (head == null) {
            QueueNode newNode = new QueueNode(value);
            head = newNode;
            size++;
            return;
        }

        else {
        
            QueueNode pointer = head;
            while (head.next != null) {
                head = head.next;
            }

            QueueNode newNode = new QueueNode(value);
            pointer.next = newNode;
            size++;
        }
        
        
    }
    
    public int DeleteHead() {
        int temp = 0;
        if (head == null) {
            System.out.println("List is Empty");
            return 0;
        }
        
        QueueNode pointer = head;
        temp = pointer.value;
        head = head.next;
        
        return temp;
    }
}
