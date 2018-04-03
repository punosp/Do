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
import java.util.LinkedList;
public class Binary_Tree {
    BT_Node root;
    LinkedList<BT_Node> queue = new LinkedList<BT_Node>();
    public void insertNode_BFS(int d) {
        
        BT_Node node = new BT_Node(d);
        if(root==null) {
            root = node;
        }
        
        else {
            BT_Node front = queue.getFirst();
            if(front.left==null)
                front.left = node;
            else if(front.right==null)
                front.right=node;
            
            if(front.left!=null && front.right!=null)
                queue.remove();
            
        }
        
        queue.add(node);
    }
    
    
    void levelOrderTraversal() {
        LinkedList<BT_Node> traverse_queue = new LinkedList<BT_Node>();
        traverse_queue.add(root);
        System.out.println("Level Order Traversal : ");
        while(!traverse_queue.isEmpty()) {
            BT_Node temp = traverse_queue.pop(); // poll, pop, remove, pollfirst
            System.out.print(temp.data + " ");
            
            if(temp.left!=null)
                traverse_queue.add(temp.left);
            
            if(temp.right!=null)
                traverse_queue.add(temp.right);
            
        }
//        System.out.println();
    }
    
    void preorder(BT_Node node) {
        if(node==null)
            return;
        
        System.out.print(node.data + " ");
        preorder(node.left); // 40 - left - null
        preorder(node.right); // 40 - right - null
        
//        initial node - 18 - write
//        18.left : node - 15 
//                15.left: node - 40:
//                    40.left - node - null
//                    40.right - nodel -null
//                    return
//                15.right - node - 50
        
    }
    
    void inorder(BT_Node node) {
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    
    
    void postorder(BT_Node node) {
        if(node==null)
            return;
        
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    
  
}
