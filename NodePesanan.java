public class NodePesanan {
    NodePesanan prev; // Pointer ke node sebelumnya
    NodePesanan next; // Pointer ke node berikutnya
    Pesanan data;

    // Konstruktor node
    public NodePesanan(Pesanan data) {
        this.data = data;
        // Node baru belum terhubung dengan node lain
        this.prev = null;
        this.next = null;
    }
}
