
package com.mycompany.tugasmdl7;

public class Cash implements Payment{
    @Override
    public double Total(double jumlah) {
        double diskon = 0.1; // 10% diskon
        return jumlah - (jumlah * diskon);
    }
}
