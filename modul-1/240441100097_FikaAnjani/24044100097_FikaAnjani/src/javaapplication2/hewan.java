package javaapplication2;
class singa {
    String nama;
    int umur;
    String warna; 
    void singa (String a, int b, String c){
        nama = a;
        umur = b;
        warna = c;
    }
}

class ayam {
    String nama1;
    int umur1;
    String warna1; 
    void ayam (String d, int e, String f){
        nama1 = d;
        umur1 = e;
        warna1 = f;
    }
}

class bebek {
    String nama2;
    int umur2;
    String warna2; 
    void bebek (String g, int h, String i){
        nama2 = g;
        umur2 = h;
        warna2 = i;
    }
}
public class hewan {
    public static void main(String[] args){
        
    bebek a = new bebek();
    a.bebek("Selly", 1, "Kuning");
    for (int i = 1 +1; i <= 4; i++) {
            System.out.println("\nNama  : " + a.nama2);
            System.out.println("Umur  : " + a.umur2 + i);
            System.out.println("Warna : " + a.warna2);
    }
    singa b = new singa();
    b.singa("Leon", 1, "Coklat");
    for (int x = 1 +1; x <= 4; x++) {
            System.out.println("\nNama  : " + b.nama);
            System.out.println("Umur  : " + b.umur + 1);
            System.out.println("Warna : " + b.warna);
    }       
    ayam c = new ayam();
    c.ayam("Okta", 1, "Biru");
    for (int y = 1 +1; y <= 4; y++) {
            System.out.println("\nNama  : " + c.nama1);
            System.out.println("Umur  : " + c.umur1 + 1);
            System.out.println("Warna : " + c.warna1);
        }    
    }
} 

