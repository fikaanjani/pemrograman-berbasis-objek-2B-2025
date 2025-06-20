
package com.mycompany.pinjambuku;

public abstract class Buku {
    protected String judul;
    protected boolean Dipinjam = false;
    protected boolean Dipesan = false;

    public Buku(String judul) {
        this.judul = judul;
    }
}
