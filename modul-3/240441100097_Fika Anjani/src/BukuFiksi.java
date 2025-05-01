
public class BukuFiksi extends Buku{
    String genre;
    
    BukuFiksi(String judul, String penulis, String genre){
        super(judul, penulis);
        this.genre = genre;
    }
    
    public void infoFiksi(){
        info();
        System.out.println("Genre   : " + genre);
    }
}
