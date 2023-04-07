package Modul3;

public class Main {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();

        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.enqueue("Hello");
        queue.enqueue("World");
        queue.enqueue("Java");

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue peek: " + queue.peek());

        String dequeued = queue.dequeue();
        System.out.println("Dequeued: " + dequeued);
        System.out.println("Queue size after dequeue: " + queue.size());

        dequeued = queue.dequeue();
        System.out.println("Dequeued: " + dequeued);
        System.out.println("Queue size after dequeue: " + queue.size());

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

