package problem4.node;

import problem1.node.TreeNode;

public class Node {
    private TreeNode node;

    private Node next;

    public Node(TreeNode node) {
        this.node = node;
        this.next = null;

    }

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
