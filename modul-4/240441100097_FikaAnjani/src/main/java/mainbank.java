
public class mainbank {

    public static void main(String[] args) {
        bank bank1 = new bank(10); // Maksimal 10 rekening

        // Tambah rekening
        bank1.tambahRekening("001", "Andi", 1000000);
        bank1.tambahRekening("002", "Budi", 500000);
        bank1.tambahRekening("003", "Citra", 750000);

        // Transaksi
        bank1.setor("001", 200000);
        bank1.tarik("002", 100000);
        bank1.tarik("003", 800000); // gagal, saldo tidak cukup

        // Tampilkan semua rekening
        bank1.tampilkanSemuaRekening();
    }
}