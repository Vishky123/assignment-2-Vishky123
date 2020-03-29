/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

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
}
