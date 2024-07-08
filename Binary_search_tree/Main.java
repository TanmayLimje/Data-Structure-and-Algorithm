package Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(47);
        bst.insert(23);
        bst.insert(33);
        bst.insert(45);
        bst.insert(22);
        System.out.println(bst.root.left.right.right.value);
    }
}
