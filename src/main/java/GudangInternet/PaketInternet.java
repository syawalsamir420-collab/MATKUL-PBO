/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GudangInternet;

/**
 *
 * @author Syawal
 */

public class PaketInternet {
    String namaPaket;
    int kecepatan;
    int harga;

    public PaketInternet(String namaPaket, int kecepatan, int harga) {
        this.namaPaket = namaPaket;
        this.kecepatan = kecepatan;
        this.harga = harga;
    }

    public void tampilkanPaket() {
        System.out.println("Nama Paket : " + namaPaket);
        System.out.println("Kecepatan  : " + kecepatan + " Mbps");
        System.out.println("Harga      : Rp" + harga);
    }
}

