
public class MahasiswaBeasiswa extends mahasiswa{
    String jenisBeasiswa;
    
    MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa){
    super(nama, nim);
    this.jenisBeasiswa = jenisBeasiswa;
    }
    
    void infoBeasiswa(){
        infomahasiswa();
        System.out.println("Jenis Beasiswa : " + jenisBeasiswa);
    }
}
