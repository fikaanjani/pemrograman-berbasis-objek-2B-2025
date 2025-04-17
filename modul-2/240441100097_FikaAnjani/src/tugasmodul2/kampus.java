package tugasmodul2;
public class kampus {
    String nama;
    String alamat; 
    
    static int jmlhmhs = 0;
    
    public kampus (String nama, String alamat){
        if(!KampusValid(nama)){
            System.out.println("Nama kampus tidak boleh menggunakan angka");
            this.nama = "Tidak valid karena menggunakan angka";
    }else{
            this.nama = nama;
        }
    this.alamat = alamat;
    }
    
    public static void tambahmhs(){
      jmlhmhs++;
    }
    
    public void tampilkaninfo(){
        System.out.println("\n=====Info Kampus=====");
        System.out.println("Nama kampus      : "+ nama);
        System.out.println("Alamat kampus    : "+ alamat);
        System.out.println("Jumlah mahasiswa : "+ jmlhmhs);
    }
    
    public static boolean KampusValid(String nama){
        for(int i = 0; i < nama.length(); i++){
            if(Character.isDigit(nama.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

