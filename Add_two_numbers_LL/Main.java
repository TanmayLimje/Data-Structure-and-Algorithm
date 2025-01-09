public class Main {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode temp = new ListNode(0);
        ListNode curr = temp;

        int sum = 0;
        int carry = 0;

        while(l1 != null || l2 != null || sum >0){
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = (int) Math.floor(sum / 10);
            sum = sum % 10;

            curr.next = new ListNode(sum);
            curr = curr.next;

            sum = carry;
            carry = 0;
        }


        return temp.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String [] arg){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("L1: ");
        printList(l1);

        System.out.println("L2: ");
        printList(l2);

        System.out.print("Result: ");
        printList(result);
    }
}
