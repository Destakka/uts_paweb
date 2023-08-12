package com.uts.customerhotel;

public class customerinfo {
    public static void main(String[] args) {
        Customer customer = new Customer("987654321", "Desta Atikananda", "Yogyakarta", "2112");
        customerInfo(customer);
    }

    public static void customerInfo(Customer customer) {
        System.out.println("Informasi Tamu:");
        customer.infoTamu();
    }
}
