
package tugasmodul5;

abstract class Manusia{
    abstract void berbicara();
    abstract void bekerja();
    abstract void makan();
}

class Joko extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Halo, saya Joko");
    }
    
    @Override
    public void bekerja(){
        System.out.println("pekerjaan saya tentara");
    }
    
    @Override
    public void makan(){
        System.out.println("Saya suka makan nasi pecel lele");
    }
}

class Beni extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Hello, Aku Beni");
    }
    
    @Override
    public void bekerja(){
        System.out.println("pekerjaanku seorang guru");
    }
    
    @Override
    public void makan(){
        System.out.println("makanan kesukaanku nasi goreng");
    }
}

class Jani extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Hai semua aku jani");
    }
    
    @Override
    public void bekerja(){
        System.out.println("pekerjaanku saat ini seorang perawat");
    }
    
    @Override
    public void makan(){
        System.out.println("saya suka makan bakso");
    }
}

class Fani extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("aku fani");
    }
    
    @Override
    public void bekerja(){
        System.out.println("aku bekerja sebagai dokter");
    }
    
    @Override
    public void makan(){
        System.out.println("makanan favoritku soto ayam");
    }
}
public class TugasModul5 {

    public static void main(String[] args) {
        Manusia[] daftarManusia = {
            new Joko(),
            new Beni(),
            new Jani(),
            new Fani()
        };

        for (Manusia m : daftarManusia) {
            m.berbicara();
            m.bekerja();
            m.makan();
            System.out.println();
        }
    }
}
