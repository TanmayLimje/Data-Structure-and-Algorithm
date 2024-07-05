package Stack;

public class Main {

    public static String reverseString(String string) {
        Stack_arraylist<Character> stack = new Stack_arraylist<Character>();
        String reversedString = "";

        for (char c : string.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        return reversedString;
    }

    public static void main(String[] args) {

        Stack_arraylist myStack = new Stack_arraylist();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Stack before pop():");
        myStack.printStack();

        System.out.println("\nPopped node:");
        System.out.println(myStack.pop());

        System.out.println("\nStack after pop():");
        myStack.printStack();

        System.out.println("\n## reversed string ##");

        String myString = "hello";
        System.out.println("string:" + myString);
        String reversedString = reverseString(myString);
        System.out.println("reversed string: "+reversedString);
    }
}
