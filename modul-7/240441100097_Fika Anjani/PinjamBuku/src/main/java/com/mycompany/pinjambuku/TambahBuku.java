
package com.mycompany.pinjambuku;

import java.util.ArrayList;
public class TambahBuku {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
}
