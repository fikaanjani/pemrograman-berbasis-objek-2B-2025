
package com.mycompany.booking;

public class Motor extends Kendaraan implements Booking{
     public Motor() {
        super("Motor", 18);
    }

    @Override
    public double pinjam(int durasi) {
        return durasi * 100000;
    }
}
