package tugasmodul2;
public class mainmatakuliah {
    public static void main(String[] args) {
        
        matakuliah a1 = new matakuliah("abc12", "Algoritma", 2);
        matakuliah a2 = new matakuliah("abc13", "Struktur Data", 3);
        matakuliah a3 = new matakuliah("abc14", "Basis Data", 3);
        matakuliah a4 = new matakuliah("abc15", "Jaringan Komputer", 3); 
        matakuliah a5 = new matakuliah("abc16", "Manajemen Jaringan", 2);
        matakuliah a6 = new matakuliah("abc17", "Analisa Bisnis", 2);
        matakuliah a7 = new matakuliah("abc18", "Analisa Bisnis", 1);
        matakuliah a8 = new matakuliah("abc19", "Analisa Bisnis", 1);
        
        a1.tampilkaninfo();
        a2.tampilkaninfo();
        a3.tampilkaninfo();
        a4.tampilkaninfo(); 
        a5.tampilkaninfo();
        a6.tampilkaninfo();
        a7.tampilkaninfo();
        a8.tampilkaninfo();
    }
    
}
