package heap;

public class Main {
    public static void main(String[] arg){
        Heap heap = new Heap();

        heap.insert(95);
        heap.insert(75);
        heap.insert(80);
        heap.insert(55);
        heap.insert(60);


        System.out.println( heap.getHeap());

        heap.insert(50);
        System.out.println( heap.getHeap());

        heap.insert(65);
        System.out.println( heap.getHeap());

        heap.remove();
        System.out.println(heap.getHeap());

        heap.remove();
        System.out.println(heap.getHeap());

    }
}
