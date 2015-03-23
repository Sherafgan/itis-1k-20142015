/**
 * Created by ma on 23.03.15.
 */
public class Node {
    private int value;
    private Node left, right;

    public Node(int i) {
        value = i;
    }

    public Node(int i, Node left, Node right) {
        this.value = i;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
