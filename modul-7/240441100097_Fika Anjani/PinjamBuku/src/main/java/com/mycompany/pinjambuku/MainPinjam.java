
package com.mycompany.pinjambuku;

public class MainPinjam {

    public static void main(String[] args) {
        BukuFiksi b1 = new BukuFiksi("Laskar Pelangi");
        BukuNonFiksi b2 = new BukuNonFiksi("Ensiklopedia Indonesia");
        System.out.println("=====Peminjaman Dan Pemesanan Buku=====");
        b1.pinjam("Andi");
        b1.pesan("Budi");
        b2.pesan("Citra");
    }
    
}
