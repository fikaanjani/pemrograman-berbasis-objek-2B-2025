
package com.mycompany.tugasmdl7;

public class MainPayment {

    public static void main(String[] args) {
       Payment cash = new Cash();
       Payment kred = new Kredit();
       Payment wallet = new Ewallet();
       
       double jumlah = 100000;
       System.out.println("======Pembayaran======");
       System.out.println("Tunai: " + cash.Total(jumlah));
       System.out.println("Kartu Kredit: " + kred.Total(jumlah));
       System.out.println("E-Wallet: " + wallet.Total(jumlah));
    }
    
}
