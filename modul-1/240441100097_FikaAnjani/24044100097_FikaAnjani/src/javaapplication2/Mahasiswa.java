package javaapplication2;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    int nim;
    String prodi;
    String alamat;

    // Constructor tanpa 'this', pakai nama variabel parameter yang beda
    Mahasiswa(String namaInput, int nimInput, String prodiInput, String alamatInput) {
        nama = namaInput;
        nim = nimInput;
        prodi = prodiInput;
        alamat = alamatInput;
    }

    void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Prodi  : " + prodi);
        System.out.println("Alamat : " + alamat);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan data mahasiswa ke-1");
        System.out.print("Nama   : ");
        String nama1 = input.nextLine();
        System.out.print("NIM    : ");
        int nim1 = Integer.parseInt(input.nextLine());
        System.out.print("Prodi  : ");
        String prodi1 = input.nextLine();
        System.out.print("Alamat : ");
        String alamat1 = input.nextLine();
        Mahasiswa mhs1 = new Mahasiswa(nama1, nim1, prodi1, alamat1);
        System.out.println();

        System.out.println("Masukkan data mahasiswa ke-2");
        System.out.print("Nama   : ");
        String nama2 = input.nextLine();
        System.out.print("NIM    : ");
        int nim2 = Integer.parseInt(input.nextLine());
        System.out.print("Prodi  : ");
        String prodi2 = input.nextLine();
        System.out.print("Alamat : ");
        String alamat2 = input.nextLine();
        Mahasiswa mhs2 = new Mahasiswa(nama2, nim2, prodi2, alamat2);
        System.out.println();

        System.out.println("Masukkan data mahasiswa ke-3");
        System.out.print("Nama   : ");
        String nama3 = input.nextLine();
        System.out.print("NIM    : ");
        int nim3 = Integer.parseInt(input.nextLine());
        System.out.print("Prodi  : ");
        String prodi3 = input.nextLine();
        System.out.print("Alamat : ");
        String alamat3 = input.nextLine();
        Mahasiswa mhs3 = new Mahasiswa(nama3, nim3, prodi3, alamat3);
        System.out.println();
        
        // Tampilkan data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilkanData();
        mhs2.tampilkanData();
        mhs3.tampilkanData();
    }
}
