/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GudangInternet;

/**
 *
 * @author Syawal
 */
public class Server {
    String namaServer;
    String alamatIP;
    String lokasi;

    public Server(String namaServer, String alamatIP, String lokasi) {
        this.namaServer = namaServer;
        this.alamatIP = alamatIP;
        this.lokasi = lokasi;
    }

    public void tampilkanServer() {
        System.out.println("Nama Server : " + namaServer);
        System.out.println("Alamat IP   : " + alamatIP);
        System.out.println("Lokasi      : " + lokasi);
    }
}

