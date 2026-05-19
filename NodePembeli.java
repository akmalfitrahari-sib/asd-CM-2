public class NodePembeli {
    NodePembeli prev; // Pointer ke node sebelumnya
    NodePembeli next; // Pointer ke node berikutnya
    Pembeli data;

    // Konstruktor node
    public NodePembeli(Pembeli data) {
        this.data = data;
        // Node baru belum terhubung dengan node lain
        this.prev = null;
        this.next = null;
    }
}
