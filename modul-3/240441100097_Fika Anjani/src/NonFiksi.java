
public class NonFiksi extends Buku{
    String topik;
    
    public NonFiksi(String judul, String penulis, String topik){
       super(judul, penulis);
       this.topik = topik;
    }
    
    public void infoNonFiksi(){
            info();
            System.out.println("Topik   : " + topik);
    }
}
