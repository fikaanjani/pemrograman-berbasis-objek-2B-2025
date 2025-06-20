
package com.mycompany.pinjambuku;

public class BukuNonFiksi extends Buku implements Pesan{
    public BukuNonFiksi(String judul) {
        super(judul);
    }

    @Override
    public void pesan(String pengguna) {
        if (!Dipesan) {
            Dipesan = true;
            System.out.println(pengguna + " memesan buku Buku Non Fiksi: " + judul);
        } else {
            System.out.println("Buku Non Fiksi sudah dipesan");
        }
    }
}
