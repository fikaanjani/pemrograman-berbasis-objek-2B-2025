
public class MainMahasiswa {
    public static void main(String[] args) {
        MahasiswaReguler mhs1 = new MahasiswaReguler("Fika","240441100097","PBO-A"); 
        MahasiswaReguler mhs2 = new MahasiswaReguler("Fara","240441100165","APB-C"); 
        MahasiswaReguler mhs3 = new MahasiswaReguler("Faris","240441100987","PBW-B"); 
        MahasiswaReguler mhs4 = new MahasiswaReguler("Faiq","240441100096","EBC-A"); 
        
        MahasiswaBeasiswa mhs5 = new MahasiswaBeasiswa("Vanda","240441100092","KIP-K"); 
        MahasiswaBeasiswa mhs6 = new MahasiswaBeasiswa("Vanda","240441100092","Bank BNI"); 
        MahasiswaBeasiswa mhs7 = new MahasiswaBeasiswa("Vanda","240441100092","PT. Djarum"); 
        MahasiswaBeasiswa mhs8 = new MahasiswaBeasiswa("Vanda","240441100092","KIP-K"); 
        
        System.out.println("===Mahasiswa Reguler===");
        mhs1.infoReguler(); 
        mhs2.infoReguler(); 
        mhs3.infoReguler(); 
        mhs4.infoReguler();
        
        System.out.println("\n===Mahasiswa Beasiswa===");
        mhs5.infoBeasiswa(); 
        mhs6.infoBeasiswa(); 
        mhs7.infoBeasiswa(); 
        mhs8.infoBeasiswa(); 
    }
} 
