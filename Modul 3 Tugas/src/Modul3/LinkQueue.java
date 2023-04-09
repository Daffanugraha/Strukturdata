package Modul3;

public class LinkQueue {
    public FirstLastList list;

    public LinkQueue() {
        list = new FirstLastList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(Buku buku) {
        list.insertLast(buku);
    }

    public Buku dequeue() {
        return list.deleteFirst();
    }

    public Buku peek() {
        return list.first.buku;
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
