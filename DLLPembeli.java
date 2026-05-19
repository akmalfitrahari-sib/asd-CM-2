// Class untuk mengelola antrian pembeli menggunakan Double Linked List
public class DLLPembeli {
    NodePembeli head;
    NodePembeli tail;

    // Konstruktor untuk membuat linked list
    public DLLPembeli() {
        head = null; // Head menunjuk node pertama
        tail = null; // Tail menunjuk node terakhir
    }

    // Mengecek apakah linked list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Method untuk menambahkan pembeli ke akhir antrian
    public void addLast(Pembeli data) {
        NodePembeli newNode = new NodePembeli(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method untuk mencetak seluruh antrian pembeli
    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            //Traversal dimulai dari head
            NodePembeli current = head;

            System.out.println("===================================");
            System.out.println("Daftar Antrian Pembeli");
            System.out.println("===================================");
            System.out.printf("%-12s %-16s %-12s\n",
            "No Antrian", "Nama", "No HP");

            //Traversal sampai akhir linked list
            while (current != null) {
                current.data.tampilData(); //Menampilkan data node saat ini
                current = current.next; //Pindah ke node berikutnya
            }
        }
    }

    //Method untuk menghapus antrian pertama
    public Pembeli removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Pembeli data = head.data; //Menyimpan data pembeli yang akan dihapus
            head = head.next;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return data;
        }
    }
}
