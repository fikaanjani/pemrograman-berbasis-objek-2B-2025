
package com.mycompany.booking;

public class MainBooking {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan motor = new Motor();
        Kendaraan sepeda = new Sepeda();

        int usiaPengguna = 20;
        int durasi = 2; // hari
        
        System.out.println("======Booking Kendaraan=====");
        if (mobil.validasi(usiaPengguna)) {
            Mobil m = (Mobil) mobil;
            System.out.println("Mobil: " + (m.pinjam(durasi) + m.getAsuransi()));
        } else {
            System.out.println("Usia tidak cukup untuk sewa Mobil");
        }

        if (motor.validasi(usiaPengguna)) {
            System.out.println("Motor: " + ((Motor) motor).pinjam(durasi));
        }

        if (sepeda.validasi(usiaPengguna)) {
            System.out.println("Sepeda: " + ((Sepeda) sepeda).pinjam(durasi));
        }
    }
    
}
