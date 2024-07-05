package Stack;

public class Main {

    public static void sortStack(Stack_arraylist<Integer> stack) {
        Stack_arraylist <Integer> additionalStack = new Stack_arraylist<Integer>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                stack.push(additionalStack.pop());
            }

            additionalStack.push(temp);
        }

        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
    }

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


        Stack_arraylist<Integer> stack = new Stack_arraylist<Integer>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("\n## stack sorting ##");
        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
    }
}
