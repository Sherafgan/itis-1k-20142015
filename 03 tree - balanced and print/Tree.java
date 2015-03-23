
public class Tree {
    private Node root;

    public Tree(int n) {
        root = getBalancedTree(n);
    }

    private static Node getBalancedTree(int n) {
        if (n == 0) {
            return null;
        }
        else {
            int nl = n/2;
            int nr = n - nl - 1;
            return new Node(
                    n,
                    getBalancedTree(nl),
                    getBalancedTree(nr)
            );
        }
    }

    public Tree() {
        root = new Node(
                5,
                new Node(4),
                new Node(3)
        );
    }

    public void print() {
        printTree(root, 0);
    }

    private static void printTree(Node p, int level) {
        if (p != null) {
            printTree(p.getRight(), level + 1);
            for (int i = 1; i <= 2 * level; i++)
                System.out.print(" ");
            System.out.println(p.getValue());
            printTree(p.getLeft(), level + 1);
        }
    }

    public static void main(String[] args) {
        Tree t = new Tree(12);
        t.print();
    }
}
