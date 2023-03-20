import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList dan menambahkan elemen
        ArrayList<String> myList = new ArrayList<>();
        myList.add("sapi");
        myList.add("kelinci");
        myList.add("kambing");
        myList.add("unta");
        myList.add("domba");

        // Menampilkan isi ArrayList sebelum penghapusan elemen
        System.out.println("Isi ArrayList sebelum penghapusan elemen: " + myList);

        // Membuat ArrayList dan menambahkan elemen yang akan dihapus
        ArrayList<String> toRemove = new ArrayList<>();
        toRemove.add("kelinci");
        toRemove.add("kambing");
        toRemove.add("unta");

        // Menampilkan elemen yang akan dihapus
        System.out.println("Elemen yang akan dihapus: " + toRemove);

        // Menghapus elemen yang terdapat pada ArrayList toRemove
        for (String element : toRemove) {
            while (myList.contains(element)) {
                myList.remove(element);
            }
        }

        // Menampilkan isi ArrayList setelah penghapusan elemen
        System.out.println("Isi ArrayList setelah penghapusan elemen: " + myList);
    }
}
