/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author Owner
 */
public class LinkedList {
    Node head;
    int size;
    
    public LinkedList() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    public int size() {
        return size;
    }
    
    public void Insertion(String value) {
        Node newNode = new Node(value);
        
        if (head == null) {
            head = newNode;
            size++;
        }
        else {
            Node CurrentNode;
            CurrentNode = head;
            while (CurrentNode.next != null) {
                CurrentNode = CurrentNode.next;
            }
            CurrentNode.next = newNode;
            size++;
        }
    }
    
    public String delete(String value) {
        Node CurrentNode = head;
        Node PreviousNode = head;
        String temp = "";
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        if (size() == 1 && head.data.equals(value)) {
            temp = head.data;
            head = head.next;
            size--;
        }
        
        else {
            while (CurrentNode != null) {
                if (CurrentNode.data.equals(value)) {
                    temp = CurrentNode.data;
                    PreviousNode.next = CurrentNode.next;
                    CurrentNode = null;
                }
                
                PreviousNode = CurrentNode;
                //CurrentNode = CurrentNode.next;
            }
            size--;
        }
        
        return temp;
    }
    
    
}
