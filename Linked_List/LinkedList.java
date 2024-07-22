package linked_list;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // node creation
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // addition of new node to the list
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // removal the tail of the list
    public Node removeLast(){
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node prev = head;

        while (temp.next != tail) {
            prev = temp;
            temp = temp.next;
        }

        tail = prev;
        tail.next = null;

        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        //System.out.println("Head is " + head.value);
        return head;
    }

    public Node getTail() {
        //System.out.println("Tail is " + tail.value);
        return tail;
    }

    public void getLength() {
        System.out.println("length is " + length);
    }

    // addition of node to the start of the list
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // deletion of the node at the start of the list (removal of head node)
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    // search for the node in the list from its index
    public Node get(int index){
        if (index == 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // change the value of the node in the list based on its index
    public boolean set (int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    // addition of the new node in list based on the index
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1){
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }

    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public Node findKthFromEnd(int k){
        Node fast = head;
        Node slow = head;

        for(int i = 0; i < k; i++){
            if(fast == null)
                return null;
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public void partitionList(int x){
        if(head == null) return;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;

        while  (current != null){
            if(current.value < x){
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;

        head = dummy1.next;
    }

    public void removeDuplicates(){
        Node prev = null;
        Node current = head;
        Set<Integer> values = new HashSet<>();

        while (current != null){
            if(values.contains(current.value)){
                prev.next = current.next;
                length -= 1;
            }
            else {
                values.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }
}
