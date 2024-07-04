package Doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(1);
        myDLL.append(2);

        myDLL.remove(1);
        myDLL.printList();
    }
}
