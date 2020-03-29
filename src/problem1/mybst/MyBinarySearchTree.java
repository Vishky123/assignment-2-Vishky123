/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    static Queue<TreeNode> var;

    public TreeNode insert(TreeNode root, int value) {

        if (root == null)

            return new TreeNode(value);

        else if (value > root.getData()) // value is greater. Should be inserted to right

            root.setRight(insert(root.getRight(), value));

        else // value is smaller should be inserted to left

            root.setLeft(insert(root.getLeft(), value));

        return root;
    }

    public void inorderRecord(TreeNode root) {

        if (root.getLeft() != null) {

            inorderRecord(root.getLeft());

            System.out.println(root.getData());

            inorderRecord(root.getRight());

        }
    }

    public void nodeWithOutLeftChild(TreeNode root) {

        // If Tree is empty

        if (root == null)

            return;


        // Do level order traversal starting from root

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);


        int count = 0; // Initialize count of half nodes

        while (queue != null) {

            TreeNode temp = queue.poll();

            if (temp == null) {

                break;

            }


            if (temp.getLeft() == null)

                count++;


            // Enqueue left child

            if (temp.getLeft() != null)

                queue.add(temp.getLeft());


            // Enqueue right child

            if (temp.getRight() != null)

                queue.add(temp.getRight());

        }

        System.out.println("No of  Nodes without left child: " + count);

    }

    public void leftTree(TreeNode root) {

        if (root == null)

            return;


        // add root

        var.add(root);


        // Delimiter

        var.add(null);


        while (var.size() > 0) {

            TreeNode temp = var.peek();


            if (temp != null) {


                // Prints first node

                // of each level

                System.out.print(temp.getData() + " ");


                // add children of all nodes at

                // current level

                while (var.peek() != null) {


                    // If left child is present

                    // add into queue

                    if (temp.getLeft() != null)

                        var.add(temp.getLeft());


                    // If right child is present

                    // add into queue

                    if (temp.getRight() != null)

                        var.add(temp.getRight());


                    // remove the current node

                    var.remove();


                    temp = var.peek();

                }

                var.add(null);

            }


            // remove the delimiter of

            // the previous level

            var.remove();
        }
    }

    public void leftView(TreeNode root) {

        // Queue to store all

        // the nodes of the tree

        var = new LinkedList<TreeNode>();


        leftTree(root);

    }
}


