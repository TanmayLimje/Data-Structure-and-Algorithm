package Doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);

       // myDLL.remove(1);
        myDLL.printList();

        System.out.println();

//        myDLL.reverse();
//        myDLL.printList();

//        System.out.println("\nis pallindrom");
//        System.out.println(myDLL.isPalindrome());

        System.out.println("\nSwap pairs");
        myDLL.swapPairs();
        myDLL.printList();
    }
}
