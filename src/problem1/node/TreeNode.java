/*
 *  Created by IntelliJ IDEA.
 *  User: Vishal
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
    private TreeNode right;
    private TreeNode left;
    private int data;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
