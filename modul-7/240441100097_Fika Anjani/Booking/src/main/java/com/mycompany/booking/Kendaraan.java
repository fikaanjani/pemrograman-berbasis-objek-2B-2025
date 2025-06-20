
package com.mycompany.booking;

public abstract class Kendaraan {
    protected String nama;
    protected int usia;

    public Kendaraan(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public boolean validasi(int us) {
        return us >= usia;
    }
}
