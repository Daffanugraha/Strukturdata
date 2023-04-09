package Modul3;

        public class Main {
            public static void main(String[] args) {
                Buku buku1 = new Buku("Membaca Pikiran Orang Lewat Bahasa Tubuh", "Allan Pease");
                Buku buku2 = new Buku("Think Like a Monk", "Jay Shetty");
                Buku buku3 = new Buku("The Psychology of Money", "Morgan Housel");

                LinkQueue queue = new LinkQueue();
                queue.enqueue(buku1);
                queue.enqueue(buku2);
                queue.enqueue(buku3);

                System.out.println("Jumlah buku dalam antrian: " + queue.size());
                System.out.println();

                System.out.println("Menampilkan antrian buku:");
                queue.list.displayList();
                System.out.println();

                System.out.println("Meminjam buku pertama:");
                Buku bukuDipinjam = queue.dequeue();
                bukuDipinjam.pinjamBuku("Rani", "1900012345");
                bukuDipinjam.displayBuku();
                System.out.println();

                System.out.println("Menampilkan antrian buku setelah dipinjam:");
                queue.list.displayList();
                System.out.println();

                System.out.println("Mengembalikan buku yang dipinjam:");
                bukuDipinjam.kembalikanBuku();
                bukuDipinjam.displayBuku();
                System.out.println();

                System.out.println("Menampilkan buku yang dihapus:");
                bukuDipinjam.displayBuku();
                System.out.println();

                System.out.println("Menampilkan antrian buku setelah buku dikembalikan:");
                queue.list.displayList();
                System.out.println();
            }
        }
