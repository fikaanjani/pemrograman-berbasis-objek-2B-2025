
package tugasmodul6;

public class Manusia{
    public void berbicara(){
       System.out.println("Manusia berbicara");
}
    public void bekerja(){
      System.out.println("Manusia bekerja");
}
    public void makan(){
        System.out.println("Manusia makan");
}
}

class Joko extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("=====Informasi Joko=====");
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
        System.out.println("=====Informasi Beni=====");
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
        System.out.println("=====Informasi Jani=====");
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
        System.out.println("=====Informasi Fani=====");
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

public class Main {

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
