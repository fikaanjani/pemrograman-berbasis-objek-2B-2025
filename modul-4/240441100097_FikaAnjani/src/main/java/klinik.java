
public class klinik {
    private pasien[] daftarPasien;
    private int jumlahPasien;

    public klinik(int kapasitas) {
        daftarPasien = new pasien[kapasitas];
        jumlahPasien = 0;
    }

    public void tambahPasien(String nama, int umur, String keluhan) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = new pasien(nama, umur, keluhan);
            jumlahPasien++;
        } else {
            System.out.println("Klinik penuh, tidak bisa menambah pasien baru.");
        }
    }

    public void tampilkanDaftarPasien() {
        System.out.println("== Daftar Pasien di Klinik ==");
        for (int i = 0; i < jumlahPasien; i++) {
            daftarPasien[i].tampilkanInfo();
        }
    }
}
