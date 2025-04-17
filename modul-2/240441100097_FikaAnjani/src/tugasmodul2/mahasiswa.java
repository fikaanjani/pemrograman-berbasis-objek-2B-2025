package tugasmodul2;
public class mahasiswa {
    String nama;
    String nim;
    String prodi;
    String mk1, mk2, mk3, mk4;
    int jumlahMK = 0;

    static int jumlahMahasiswa = 0;

    public mahasiswa(String nama, String nim, String prodi) {
        if (nimValid(nim)) {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            jumlahMahasiswa++;
        } else {
            System.out.println("NIM tidak valid: " + nim);
            this.nim = null;
        }
    }

    public void tambahMataKuliah(String mk) {
        switch (jumlahMK) {
            case 0 -> mk1 = mk;
            case 1 -> mk2 = mk;
            case 2 -> mk3 = mk;
            case 3 -> mk4 = mk;
            default -> {
                System.out.println("Mata kuliah maksimal 4, tidak bisa tambah lagi.");
                return;
            }
        }
        jumlahMK++;
    }

    public void tampilkanData() {
        if (nim != null) {
            System.out.println("\n=== Biodata Mahasiswa ===");
            System.out.println("Nama  : " + nama);
            System.out.println("NIM   : " + nim);
            System.out.println("Prodi : " + prodi);
            System.out.println("Mata Kuliah:");
            if (mk1 != null) System.out.println(" - " + mk1);
            if (mk2 != null) System.out.println(" - " + mk2);
            if (mk3 != null) System.out.println(" - " + mk3);
        }
    }

    public static boolean nimValid(String nim) {
        String nimStr = String.valueOf(nim);
        return nimStr.startsWith("23") && nimStr.length() == 10;
    }

    public static void tampilkanJumlahMahasiswa() {
        System.out.println("Jumlah Mahasiswa saat ini: " + jumlahMahasiswa);
    }
}
