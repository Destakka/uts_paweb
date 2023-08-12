package com.uts.customerhotel;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String noKTP;
    private String nama;
    private String alamat;
    private String nomorKamar;
    private List<String> pesananMakanan;

    public Customer(String noKTP, String nama, String alamat, String nomorKamar) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorKamar = nomorKamar;
        this.pesananMakanan = new ArrayList<>();
    }

    public void addPesananMakanan(String pesanan) {
        pesananMakanan.add(pesanan);
    }

    public void infoTamu() {
        System.out.println("No. KTP: " + noKTP);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Kamar: " + nomorKamar);
    }

    public void waktuCheckin(String waktu) {
        System.out.println("Waktu Check-in: " + waktu);
    }

    public void waktuCheckout(String waktu) {
        System.out.println("Waktu Check-out: " + waktu);
    }

    public void informasiPembayaran(double total) {
        System.out.println("Informasi Pembayaran:");
        System.out.println("Total Biaya: " + total);
    }

    public void displayPesananMakanan() {
        System.out.println("Pesanan Makanan:");
        for (String pesanan : pesananMakanan) {
            System.out.println("- " + pesanan);
        }
    }
}
