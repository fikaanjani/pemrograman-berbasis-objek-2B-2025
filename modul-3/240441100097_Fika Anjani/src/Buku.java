

public class Buku {
    String judul;
    String penulis;
    
    public Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    
    void info(){
        System.out.println("\nJudul   : "+ judul);
        System.out.println("Penulis : "+ penulis);
    }
}
