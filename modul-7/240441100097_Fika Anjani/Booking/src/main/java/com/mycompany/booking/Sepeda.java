
package com.mycompany.booking;

public class Sepeda extends Kendaraan implements Booking{
    public Sepeda() {
        super("Sepeda", 12);
    }

    @Override
    public double pinjam(int durasi) {
        return durasi * 50000;
    }
}
