
package com.mycompany.tugasmdl7;

public class Ewallet implements Payment{
    @Override
    public double Total(double jumlah) {
        double diskon = 0.05; // 5% diskon
        return jumlah - (jumlah * diskon);
    }
}
