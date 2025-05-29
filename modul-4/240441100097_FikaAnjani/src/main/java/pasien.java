
public class pasien {
    private final String nama;
    private final int umur;
    private final String keluhan;

    public pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur + " tahun");
        System.out.println("Keluhan : " + keluhan);
        System.out.println("------------------------------");
    }
}
