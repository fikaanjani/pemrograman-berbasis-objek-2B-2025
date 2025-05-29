
public class bank {
    private final RekeningBank[] daftarRekening;
    private int jumlahRekening;

    public bank(int kapasitas) {
        daftarRekening = new RekeningBank[kapasitas];
        jumlahRekening = 0;
    }

    public void tambahRekening(String noRek, String nama, double saldoAwal) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening] = new RekeningBank(noRek, nama, saldoAwal);
            jumlahRekening++;
        } else {
            System.out.println("Gagal menambah rekening: Kapasitas penuh.");
        }
    }

    public RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getNoRekening().equals(noRek)) {
                return daftarRekening[i];
            }
        }
        return null;
    }

    public void setor(String noRek, double jumlah) {
        RekeningBank rek = cariRekening(noRek);
        if (rek != null) {
            rek.setor(jumlah);
            System.out.println("Setor berhasil ke rekening " + noRek);
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tarik(String noRek, double jumlah) {
        RekeningBank rek = cariRekening(noRek);
        if (rek != null) {
            if (rek.tarik(jumlah)) {
                System.out.println("Tarik berhasil dari rekening " + noRek);
            } else {
                System.out.println("Saldo tidak cukup atau jumlah tidak valid.");
            }
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tampilkanSemuaRekening() {
        System.out.println("== Daftar Seluruh Rekening ==");
        for (int i = 0; i < jumlahRekening; i++) {
            daftarRekening[i].tampilkanInfo();
        }
    }
}
