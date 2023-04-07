package Modul3;

public class Link {

        public String data;
        public Link next;

        public Link(String data) {
            this.data = data;
            next = null;
        }

        public void displayLink() {
            System.out.print(data + " ");
        }
    }




