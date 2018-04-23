/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author puneet
 */

import java.util.*;

public class Binary_tree_main {
    public static void main(String[] args){
        Binary_tree bt = new Binary_tree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            bt.insert_Node(sc.nextInt());
        }
        
        bt.levelOrderTraversal();
        System.out.println("Inorder traversal");
        bt.inOrderTraversal(bt.root);
        System.out.println("LCA of 19 and 12 is "+bt.FindLCA(bt.root, 19, 12).data);
    }
}
