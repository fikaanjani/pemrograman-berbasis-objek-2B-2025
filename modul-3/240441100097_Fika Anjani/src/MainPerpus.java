
import java.util.Scanner;

public class MainPerpus {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            perpustakaan perpus = new perpustakaan();
            
            System.out.print("Masukkan jumlah buku fiksi: ");
            int jumlahFiksi = scanner.nextInt();
            scanner.nextLine();
            
            for (int i = 0; i < jumlahFiksi; i++) {
                System.out.println("Masukkan data buku fiksi ke-" + (i + 1));
                System.out.print("Judul  : ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Genre  : ");
                String genre = scanner.nextLine();
                
                BukuFiksi fiksi = new BukuFiksi(judul, penulis, genre);
                perpus.tambahBukuFiksi(fiksi);
            }
            
            System.out.print("\nMasukkan jumlah buku non-fiksi: ");
            int jumlahNonFiksi = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            for (int i = 0; i < jumlahNonFiksi; i++) {
                System.out.println("Masukkan data buku non-fiksi ke-" + (i + 1));
                System.out.print("Judul  : ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Topik  : ");
                String kategori = scanner.nextLine();
                
                NonFiksi nonFiksi = new NonFiksi(judul, penulis, kategori);
                perpus.tambahBukuNonFiksi(nonFiksi);
            }
            
            System.out.println("\nDaftar Koleksi Buku di Perpustakaan:");
            perpus.tampilkanKoleksi();
        }
    }
}
