package tugasmodul2;
public class matakuliah {
    String kodematkul;
    String matakuliah;
    int sks;
    
    public matakuliah (String kodematkul, String matakuliah, int sks){
        if(SKSValid(sks)){
            this.kodematkul = kodematkul;
            this.matakuliah = matakuliah;
            this.sks = sks;
        }else{
            this.kodematkul = null;
            this.matakuliah = null;
            this.sks = 0;
        }
    }
    
    public void tampilkaninfo(){
        if (kodematkul != null){
            System.out.println("\n=====Data Mata Kuliah=====");
            System.out.println("Kode mata kuliah : "+ kodematkul);
            System.out.println("Mata kuliah      : "+ matakuliah);
            System.out.println("SKS              : "+ sks);
        }else{
            System.out.println("\nData mata kuliah tidak valid.");
            System.out.println("SKS tidak valid  :" +sks);
        }
    }
    public static boolean SKSValid(int sks) {
        return sks == 2 || sks == 3;
    }
}
