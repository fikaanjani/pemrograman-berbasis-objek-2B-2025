
package tugas2modul6;

abstract class Mobil {
    abstract void nyalakanMesin();
    abstract void matikanMesin();
}

class MobilSport extends Mobil {
    @Override
    void nyalakanMesin() {
        System.out.println("=======Informasi Mobil Sport=======");
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mobil sport dimatikan dengan halus.");
        System.out.println();
    }
}

class MobilSedan extends Mobil {
    @Override
    void nyalakanMesin() {
        System.out.println("=======Informasi Mobil Sedan=======");
        System.out.println("Mobil sedan dinyalakan secara halus.");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}

class ManajemenMobil {
    private final Mobil[] daftarMobil;
    private int jumlahMobil;

    public ManajemenMobil(int kapasitas) {
        daftarMobil = new Mobil[kapasitas];
        jumlahMobil = 0;
    }

    public void tambahMobil(Mobil mobil) {
        if (jumlahMobil < daftarMobil.length) {
            daftarMobil[jumlahMobil] = mobil;
            jumlahMobil++;
        } else {
            System.out.println("Kapasitas penyimpanan mobil penuh.");
        }
    }

    public void operasikanSemuaMobil() {
        for (int i = 0; i < jumlahMobil; i++) {
            daftarMobil[i].nyalakanMesin();
            daftarMobil[i].matikanMesin();
        }
    }
}
    
public class Tugas2Modul6 {

    public static void main(String[] args) {
        ManajemenMobil manajemen = new ManajemenMobil(10); // kapasitas 10 mobil

        Mobil sport = new MobilSport();
        Mobil sedan = new MobilSedan();

        manajemen.tambahMobil(sport);
        manajemen.tambahMobil(sedan);

        manajemen.operasikanSemuaMobil();
    }
    
}
