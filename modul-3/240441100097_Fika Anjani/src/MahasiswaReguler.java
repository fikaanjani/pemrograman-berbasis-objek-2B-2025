
public class MahasiswaReguler extends mahasiswa {
    String kelas;
    
   MahasiswaReguler(String nama, String nim, String kelas){
        super(nama, nim);
        this.kelas = kelas;
   }
   
   public void infoReguler(){
        infomahasiswa();
        System.out.println("Kelas : " + kelas);
    }
}
