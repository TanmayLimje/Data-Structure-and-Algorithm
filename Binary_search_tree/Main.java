package BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        System.out.println("\nTree Traversal:\n");
        System.out.println("BFS: " + bst.BFS());
        System.out.println("DFS-PreOrder: " + bst.DFSPreOrder());
        System.out.println("DFS-PostOrder: " + bst.DFSPostOrder());
        System.out.println("DFS-InOrder: " + bst.DFSInOrder());

        //System.out.println("min value in tree: "+bst.minValue(bst.root));
//
//        //System.out.println(bst.root.left.right.right.value);
//
//        System.out.println(bst.rContains(27));
//        System.out.println(bst.rContains(17));

//          bst.rInsert(2);
//          bst.insert(1);
//          bst.insert(3);
//
//        System.out.println("\nRoot: " + bst.root.value);
//        System.out.println("Root->left : " + bst.root.left.value);
//        System.out.println("Root->right : " + bst.root.right.value);
//
//        bst.deleteNode(2);
//
//        System.out.println("\nRoot: " + bst.root.value);
//        System.out.println("Root->left : " + bst.root.left.value);
//        System.out.println("Root->right : " + bst.root.right);
    }
}




