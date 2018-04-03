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
public class Complete_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Binary_Tree tree = new Binary_Tree();
        for(int i=0;i<n;i++) {
            tree.insertNode_BFS(sc.nextInt());
        }
        
        tree.levelOrderTraversal();
        System.out.println("");
        System.out.println("Predorder");
        tree.preorder(tree.root);
        System.out.println("");
        System.out.println("Postorder");
        tree.postorder(tree.root);
        System.out.println("");
        System.out.println("Inorder");
        tree.inorder(tree.root);
        
    }
}
