/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue queue = new MyQueue();
        System.out.println("Enter the no of data you want to add ");
        int data = sc.nextInt();
        System.out.println("Enter the value");
        MyBinarySearchTree child = new MyBinarySearchTree();

        TreeNode root;

        root = new TreeNode(data);
        for (int i = 0; i < data; i++) {
            child.insert(root, sc.nextInt());
        }
        queue.preOrder(root);
        queue.queuePrint(queue);
        System.out.println("Enter to find preorder Successor :");
        queue.printSuccessor(sc.nextInt());

    }
}

