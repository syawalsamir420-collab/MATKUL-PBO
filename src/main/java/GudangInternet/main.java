/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GudangInternet;

public class main {
    public static void main(String[] args) {

        PaketInternet paket = new PaketInternet(
            "Paket 20 Mbps",
            20,
            150000
        );

        Server server = new Server(
            "Server Utama",
            "192.168.10.1",
            "Ruang Server"
        );

        Pelanggan pelanggan = new Pelanggan(
            "Budi",
            "Samarinda",
            "081234567890",
            paket
        );

        System.out.println("=== DATA PAKET INTERNET ===");
        paket.tampilkanPaket();

        System.out.println("\n=== DATA SERVER ===");
        server.tampilkanServer();

        System.out.println("\n=== DATA PELANGGAN ===");
        pelanggan.tampilkanPelanggan();
    }
}