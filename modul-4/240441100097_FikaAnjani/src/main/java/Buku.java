
public class Buku {
    private final String judul;
    private final String penulis;
    private final int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void tampilkanInfo() {
        System.out.println("Judul         : " + judul);
        System.out.println("Penulis       : " + penulis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("----------------------------------");
    }
}
