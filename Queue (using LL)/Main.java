package Queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(7);
        myQueue.enqueue(1);
        myQueue.enqueue(2);

        System.out.println(myQueue.dequeue());

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLenght();
        myQueue.printQueue();
    }
}
