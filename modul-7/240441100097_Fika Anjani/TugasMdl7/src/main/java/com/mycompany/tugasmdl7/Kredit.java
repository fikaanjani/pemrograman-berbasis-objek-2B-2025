
package com.mycompany.tugasmdl7;

public class Kredit implements Payment{
    @Override
    public double Total(double jumlah) {
        double TambahBiaya = 0.02; // 2% Biaya Tambahan
        return jumlah + (jumlah * TambahBiaya);
    } 
}
