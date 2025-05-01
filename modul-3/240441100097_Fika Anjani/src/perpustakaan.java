
import java.util.ArrayList;

class perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    ArrayList<NonFiksi> koleksiNonFiksi = new ArrayList<>();

    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(NonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("===== Koleksi Buku Fiksi =====");
        if (!koleksiFiksi.isEmpty()) koleksiFiksi.get(0).infoFiksi();
        if (koleksiFiksi.size() > 1) koleksiFiksi.get(1).infoFiksi();
        if (koleksiFiksi.size() > 2) koleksiFiksi.get(2).infoFiksi();


        System.out.println("\n===== Koleksi Buku Non-Fiksi =====");
        if (!koleksiNonFiksi.isEmpty()) koleksiNonFiksi.get(0).infoNonFiksi();
        if (koleksiNonFiksi.size() > 1) koleksiNonFiksi.get(1).infoNonFiksi();
        if (koleksiNonFiksi.size() > 2) koleksiNonFiksi.get(2).infoNonFiksi();
    }
}