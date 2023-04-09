package Modul3;

public class Buku {
    public String judul;
    public String penulis;
    public String peminjam;
    public String nimPeminjam;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.peminjam = "";
        this.nimPeminjam = "";
    }

    public void pinjamBuku(String peminjam, String nimPeminjam) {
        this.peminjam = peminjam;
        this.nimPeminjam = nimPeminjam;
    }

    public void kembalikanBuku() {
        this.peminjam = "";
        this.nimPeminjam = "";
    }

    public void displayBuku() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        if (this.peminjam.equals("")) {
            System.out.println("Status: Buku masih tersedia");
        } else {
            System.out.println("Status: Buku sedang dipinjam oleh " + this.peminjam + " (NIM: " + this.nimPeminjam + ")");
        }
    }
}
