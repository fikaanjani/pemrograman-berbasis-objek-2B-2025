
public class mianperpus {

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan(10); // Maksimal 10 buku

        // Menambahkan beberapa buku
        perpustakaan.tambahBuku("Laskar Pelangi", "Andrea Hirata", 529);
        perpustakaan.tambahBuku("Bumi", "Tere Liye", 440);
        perpustakaan.tambahBuku("Negeri 5 Menara", "Ahmad Fuadi", 432);

        // Menampilkan semua buku
        perpustakaan.tampilkanDaftarBuku();
    }
}
