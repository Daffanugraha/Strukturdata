package Modul3;

public class Link {
    public Buku buku;
    public Link next;

    public Link(Buku buku) {
        this.buku = buku;
        next = null;
    }

    public void displayLink() {
        buku.displayBuku();
        System.out.println();
    }
}
