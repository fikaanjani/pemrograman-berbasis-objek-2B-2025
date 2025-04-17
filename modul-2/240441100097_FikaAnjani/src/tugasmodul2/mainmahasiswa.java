package tugasmodul2;

public class mainmahasiswa {
    public static void main(String[] args) {
        
        mahasiswa m1 = new mahasiswa("Fika", "2312345678", "Informatika");
        mahasiswa m2 = new mahasiswa("Andi", "2312345679", "Sistem Informasi");
        mahasiswa m3 = new mahasiswa("Budi", "2312345680", "Teknik Komputer");
        mahasiswa m4 = new mahasiswa("Citra", "2209876543", "Teknik Elektro"); 
        mahasiswa m5 = new mahasiswa("Dina", "2312345681", "Manajemen Informatika");
        mahasiswa m6 = new mahasiswa("Eko", "2312345682", "Teknologi Informasi");

        m1.tambahMataKuliah("Algoritma");
        m1.tambahMataKuliah("Struktur Data");

        m2.tambahMataKuliah("Basis Data");
        m2.tambahMataKuliah("Jaringan Komputer");

        m3.tambahMataKuliah("Pemrograman Java");

        m5.tambahMataKuliah("Kalkulus");
        m5.tambahMataKuliah("Sistem Informasi");

        m6.tambahMataKuliah("Analisis Data");
        m6.tambahMataKuliah("UI/UX");
        m6.tambahMataKuliah("Mobile Programming");
        
        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
        m4.tampilkanData(); 
        m5.tampilkanData();
        m6.tampilkanData();

        mahasiswa.tampilkanJumlahMahasiswa();
    }
}
