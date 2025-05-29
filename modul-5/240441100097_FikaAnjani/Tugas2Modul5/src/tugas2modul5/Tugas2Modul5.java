
package tugas2modul5;

abstract class Mobil {
    abstract void nyalakanMesin();
    abstract void matikanMesin();
}

class MobilSport extends Mobil {
    @Override
    void nyalakanMesin() {
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mobil sport dimatikan dengan halus.");
    }
}

class MobilSedan extends Mobil {
    @Override
    void nyalakanMesin() {
        System.out.println("Mobil sedan dinyalakan secara halus.");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}
public class Tugas2Modul5 {
    public static void main(String[] args) {
        MobilSport a = new MobilSport();
        MobilSedan b = new MobilSedan();

        a.nyalakanMesin();
        a.matikanMesin();
        System.out.println();
        b.nyalakanMesin();
        b.matikanMesin();
    }
}
