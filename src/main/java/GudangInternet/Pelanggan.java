/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GudangInternet;

/**
 *
 * @author Syawal
 */
public class Pelanggan {
    String namaPelanggan;
    String alamat;
    String nomorTelepon;
    PaketInternet paket;

    public Pelanggan(String namaPelanggan, String alamat, String nomorTelepon, PaketInternet paket) {
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.paket = paket;
    }

    public void tampilkanPelanggan() {
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Nomor Telepon  : " + nomorTelepon);
        System.out.println("Paket          : " + paket.namaPaket);
    }
}
