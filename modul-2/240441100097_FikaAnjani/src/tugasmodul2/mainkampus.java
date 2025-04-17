package tugasmodul2;
public class mainkampus {
    public static void main(String[] args) {
        kampus kmp1 = new kampus("Universitas Airlangga", "Surabaya");
        kampus kmp2 = new kampus("Universitas Brawijaya", "Malang");
        kampus kmp3 = new kampus("Universitas Indonesia", "Jakarta");
        kampus kmp4 = new kampus("Universitas Trunojoyo Madura", "Madura");
        kampus kmp5 = new kampus("Universitas Jember1", "Jember");
        
        kampus.tambahmhs();
        kampus.tambahmhs();
        kampus.tambahmhs();
        kampus.tambahmhs();
        kampus.tambahmhs();
        kampus.tambahmhs();
        
        kmp1.tampilkaninfo();
        kmp2.tampilkaninfo();
        kmp3.tampilkaninfo();
        kmp4.tampilkaninfo();
        kmp5.tampilkaninfo();
    }
    
}
