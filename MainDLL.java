import java.util.Scanner;
// Class utama untuk menjalankan program
public class MainDLL {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DLLPembeli antrian = new DLLPembeli(); // Membuat linked list untuk antrian pembeli
    DLLPesanan daftarPesanan = new DLLPesanan(); ;; // Membuat linked list untuk daftar pesanan
    int pilihan;
    int noAntrian = 1; // Nomor antrian otomatis dimulai dari 1

    do {
        // Menampilkan menu utama
        System.out.println("=============================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("=============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Buat Pesanan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            // Menu tambah antrian pembeli
            case 1: 
            {
                Pembeli pembeli = inputPembeli(sc, noAntrian);
                antrian.addLast(pembeli);

                System.out.println("Antrian berhasil ditambahkan dengan nomor antrian: " + pembeli.noAntrian);
                noAntrian++;
                break;
            }
            // Menu cetak antrian pembeli
            case 2:
                antrian.cetakAntrian();
                break;
            // Menu hapus antrian pembeli dan buat pesanan
            case 3:
            {
                Pembeli pembeli = antrian.removeFirst();
                if (pembeli != null) {
                    Pesanan p = inputPesanan(sc);
                    daftarPesanan.addLast(p);

                    System.out.println(pembeli.namaPembeli + " telah memesan " + p.namaPesanan);
                } else {
                    System.out.println("Tidak ada antrian untuk dihapus.");
                }
                break;
            }
            // Menu laporan pesanan yang diurutkan berdasarkan nama pesanan
            case 4:
                daftarPesanan.insertionSort();
                daftarPesanan.laporanPesanan();
                break;
            // Menu keluar dari program
            case 0:
                System.out.println("Terima kasih telah menggunakan layanan kami!");
                break;
            // Menu untuk pilihan yang tidak valid
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();

        } while (pilihan != 0);
    }
    
    // Method untuk input data pembeli
    public static Pembeli inputPembeli(Scanner sc, int noAntrian) {
        System.out.print("Nama Pembeli : ");
        String namaPembeli = sc.nextLine();

        System.out.print("No HP : ");
        String noHP = sc.nextLine();
        // Mengembalikan object pembeli baru
        return new Pembeli(noAntrian, namaPembeli, noHP);
    }

    // Method untuk input data pesanan
    public static Pesanan inputPesanan(Scanner sc) {
        System.out.print("Kode Pesanan : ");
        int kodePesanan = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Pesanan : ");
        String namaPesanan = sc.nextLine();

        System.out.print("Harga        : ");
        int harga = sc.nextInt();
        sc.nextLine(); 
        // Mengembalikan object pesanan baru
        return new Pesanan(kodePesanan, namaPesanan, harga);
    }
}
