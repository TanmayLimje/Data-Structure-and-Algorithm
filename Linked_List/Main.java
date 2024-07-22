package linked_list;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(3);
        myLinkedList.append(8);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.append(5);
        myLinkedList.print();

        myLinkedList.removeDuplicates();
        System.out.println("\nLL after removing dupes");
        myLinkedList.print();

//        myLinkedList.partitionList(5);
//        System.out.println("\nLL after partiton:");
//        myLinkedList.print();

//        System.out.println("\nKth value from end: ");
//        System.out.println(myLinkedList.findKthFromEnd(2).value);

//        myLinkedList.getTail().next = myLinkedList.getHead().next;
//
//        System.out.println("Has Loop:");
//        System.out.println( myLinkedList.hasLoop());

//        Node middle = myLinkedList.findMiddleNode();
//        System.out.println("middle node:" + middle.value);

    }
}
