package linked_list;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.print();

        Node middle = myLinkedList.findMiddleNode();
        System.out.println("middle node:" + middle.value);


    }
}
