/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonu
 */
public class LinkedList {
    
    Node head = null;
    
    void append_to_tail(int d) {
        Node n = new Node(d);
        if(head==null) {
            head = n;
            return;
        }
        
        Node current = head;
        while(current.next!=null) {
            current = current.next;
        }
        current.next = n;
    }
    
    
    
    void print_linked_list() {
        Node current = head;
        while(current!=null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
   
}

