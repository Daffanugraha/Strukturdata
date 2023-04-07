package Modul3;

public class LinkQueue {
    private FirstLastList list;

    public LinkQueue() {
        list = new FirstLastList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(int data) {
        list.insertLast(data);
    }

    public int dequeue() {
        return list.deleteFirst();
    }

    public int peek() {
        return list.first.data;
    }

    public int size() {
        Link current = list.first;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
