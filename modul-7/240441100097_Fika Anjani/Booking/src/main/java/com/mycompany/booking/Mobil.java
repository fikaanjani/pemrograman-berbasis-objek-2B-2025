
package com.mycompany.booking;

public class Mobil extends Kendaraan implements Booking, Asuransi{
    public Mobil() {
        super("Mobil", 21);
    }

    @Override
    public double pinjam(int durasi) {
        return durasi * 200000;
    }

    @Override
    public double getAsuransi() {
        return 50000;    
    }
}
