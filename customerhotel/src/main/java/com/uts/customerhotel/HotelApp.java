package com.uts.customerhotel;


public class HotelApp {
    public static void main(String[] args) {
        Customer customer = new Customer("987654321", "Desta Atikananda", "Yogyakarta", "2112");

        customer.addPesananMakanan("Nasi Goreng");
        customer.addPesananMakanan("Ayam Woku");
        customer.addPesananMakanan("Lychee Tea");

        customerinfo.customerInfo(customer);
        customercheckin.customerCheckin(customer, "08:00 AM");
        customercheckout.customerCheckout(customer, "12:00 PM");
        customer.displayPesananMakanan();

        double totalBiaya = 150.000; 
        customer.informasiPembayaran(totalBiaya);
    }
}
