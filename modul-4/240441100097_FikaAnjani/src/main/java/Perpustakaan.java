
public class Perpustakaan {
    private final Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(String judul, String penulis, int jumlahHalaman) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = new Buku(judul, penulis, jumlahHalaman);
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan penuh, tidak bisa menambahkan buku baru.");
        }
    }

    public void tampilkanDaftarBuku() {
        System.out.println("== Daftar Buku di Perpustakaan ==");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].tampilkanInfo();
        }
    }
}
