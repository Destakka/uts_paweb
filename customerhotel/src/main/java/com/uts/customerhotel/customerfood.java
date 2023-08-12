package com.uts.customerhotel;

public class customerfood {
    public static void main(String[] args) {
        Customer customer = new Customer("987654321", "Desta Atikananda", "Yogyakarta", "2112");
        customer.addPesananMakanan("Nasi Goreng");
        customer.addPesananMakanan("Ayam Goreng");
        customer.addPesananMakanan("Es Teh");
        displayPesananMakanan(customer);
    }

    public static void displayPesananMakanan(Customer customer) {
        System.out.println("Pesanan Makanan:");
        customer.displayPesananMakanan();
    }
}
