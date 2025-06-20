
package com.mycompany.pinjambuku;

public class BukuFiksi extends Buku implements Pinjam, Pesan{
    public BukuFiksi(String judul) {
        super(judul);
    }

    @Override
    public void pinjam(String pengguna) {
        if (!Dipinjam) {
            Dipinjam = true;
            System.out.println(pengguna + " meminjam buku fiksi: " + judul);
        } else {
            System.out.println("Buku fiksi sudah dipinjam");
        }
    }

    @Override
    public void pesan(String pengguna) {
        if (!Dipesan) {
            Dipesan = true;
            System.out.println(pengguna + " memesan buku fiksi: " + judul);
        } else {
            System.out.println("Buku fiksi sudah dipesan");
        }
    }
}
