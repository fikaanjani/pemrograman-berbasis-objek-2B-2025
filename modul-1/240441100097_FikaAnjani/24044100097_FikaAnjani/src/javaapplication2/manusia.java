package javaapplication 2;
public class manusia {
    String nama;
    int umur;
    String alamat;
    
    void Manusia (String a, int b, String c){
        nama = a;
        umur = b;
        alamat = c;   
    }
    
    void tampilkanInfo(){
    System.out.println("Nama   :" +nama);
    System.out.println("Umur   :" +umur);
    System.out.println("Alamat :" +alamat);
    }
    void berjalan(){
    System.out.println("Aktivitas : Berjalan");
    }
    void berlari(){
    System.out.println("Aktivitas : Berlari");
    }
    
    public static void main(String[] args) {
        manusia mns =  new manusia();
        System.out.println("Informasi Manusia 1");
        mns.Manusia("Fara", 13, "Malang");
        mns.tampilkanInfo();
        mns.berjalan();
        
        manusia mns1 =  new manusia();
        System.out.println("\nInformasi Manusia 2");
        mns1.Manusia("Khansa", 15, "Lumajang");
        mns1.tampilkanInfo();
        mns1.berlari();
        
        manusia mns2 =  new manusia();
        System.out.println("\nInformasi Manusia 3");
        mns2.Manusia("Ikha", 20, "Pasuruan");
        mns2.tampilkanInfo();
        mns2.berlari();
        
        manusia mns3 =  new manusia();
        System.out.println("\nInformasi Manusia 4");
        mns.Manusia("Mita", 25, "Surabaya");
        mns.tampilkanInfo();
        mns.berjalan();
        
        manusia mns4 =  new manusia();
        System.out.println("\nInformasi Manusia 5");
        mns.Manusia("Faris", 30, "Bandung");
        mns.tampilkanInfo();
        mns.berlari();
    }
}
