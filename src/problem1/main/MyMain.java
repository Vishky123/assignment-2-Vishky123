/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
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

        child.leftView(root);
    }
}

