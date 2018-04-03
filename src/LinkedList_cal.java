/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonu
 */
import java.util.*;
public class LinkedList_cal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        LinkedList list = new LinkedList();
        
        for(int i=0;i<n;i++) {
            int data = sc.nextInt();
            list.append_to_tail(data);
//            System.out.println("hello");
        }
        
        
        list.print_linked_list();
    }
    
}
