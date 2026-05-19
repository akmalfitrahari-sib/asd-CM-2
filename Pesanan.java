public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    // Konstruktor untuk menginisialisasi data pesanan
    public Pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    // Method untuk menampilkan data pesanan dalam format tabel
    public void tampilData() {
        System.out.printf("%-12d %-16s %-12d\n", kodePesanan, namaPesanan, harga);
    }
}