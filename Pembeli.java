public class Pembeli {
    String namaPembeli;
    String noHP;
    int noAntrian;

     // Konstruktor untuk menginisialisasi data pembeli
    public Pembeli(int noAntrian, String namaPembeli, String noHP) {
        this.namaPembeli = namaPembeli;
        this.noHP = noHP;
        this.noAntrian = noAntrian;
    }

     // Method untuk menampilkan data pembeli dalam format tabel
    public void tampilData() {
        System.out.printf("%-12d %-16s %-12s\n", noAntrian, namaPembeli, noHP);
    }
}
