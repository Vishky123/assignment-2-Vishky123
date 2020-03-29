/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        TraversalTree.Traversal view = new TraversalTree.Traversal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of data you want to add ");
        int data = sc.nextInt();
        System.out.println("Enter the value");
        MyBinarySearchTree child = new MyBinarySearchTree();

        TreeNode root;

        root = new TreeNode(data);
        for (int i = 0; i < data; i++) {
            child.insert(root, sc.nextInt());
        }
        view.printPostorder(root);
    }
}
