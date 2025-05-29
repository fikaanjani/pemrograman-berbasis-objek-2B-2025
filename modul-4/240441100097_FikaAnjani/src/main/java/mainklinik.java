
public class mainklinik {
    
    public static void main(String[] args) {
        klinik klinik1 = new klinik(10); // Maksimal 10 pasien

        // Menambahkan beberapa pasien
        klinik1.tambahPasien("Siti", 25, "Demam");
        klinik1.tambahPasien("Budi", 40, "Sakit Kepala");
        klinik1.tambahPasien("Rina", 30, "Batuk");

        // Menampilkan seluruh pasien
        klinik1.tampilkanDaftarPasien();
    }
}
