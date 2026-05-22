// Class untuk mengelola antrian pesanan menggunakan Double Linked List
public class DLLPesanan {
    NodePesanan head;
    NodePesanan tail;

    // Mengecek apakah linked list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Method untuk menambahkan pesanan ke akhir antrian
    public void addLast(Pesanan data) {
        NodePesanan newNode = new NodePesanan(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Pesanan berhasil ditambahkan. ");
    }

     // Mengurutkan data pesanan berdasarkan nama pesanan
    public void insertionSort() {
        if (head == null) {
            return;
        }

        NodePesanan current = head.next;

        while (current != null) {
            Pesanan key = current.data; // Menyimpan data yang akan dibandingkan
            NodePesanan temp = current.prev; // Temp digunakan untuk membandingkan node sebelumnya

            while (temp != null && temp.data.namaPesanan.compareToIgnoreCase(key.namaPesanan) > 0) {
                temp.next.data = temp.data; // Geser data ke depan
                temp = temp.prev; // Pindah ke node sebelumnya
            }

            if (temp == null) {
                head.data = key;
            } else {
                temp.next.data = key;
            }

            current = current.next;
        }
    }

    // Method untuk menampilkan seluruh pesanan 
    // MODIFIKASI: Menambahkan nomor urut pada laporan pesanan
    public void laporanPesanan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } 
            System.out.println("===================================");
            System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
            System.out.println("===================================");
            // Menambahkan kolom "No" di depan
            System.out.printf("%-5s %-12s %-16s %-12s\n",
            "No", "Kode Pesanan", "Nama Pesanan", "Harga");

            NodePesanan current = head; // Traversal dimulai dari head
            
            int i = 1; // inisialisasi nomor urut
            while (current != null) {
                System.out.printf("%-5d ", i); // i hanya untuk dicetak
                current.data.tampilData();
                current = current.next;
                i++; // Increment nomor urut
            }
    }
}

