package Modul3;

public class LinkQueue {
    private FirstLastList list;

    public LinkQueue() {
        list = new FirstLastList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(String data) {
        list.insertLast(data);
    }

    public String dequeue() {
        return list.deleteFirst();
    }

    public String peek() {
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
