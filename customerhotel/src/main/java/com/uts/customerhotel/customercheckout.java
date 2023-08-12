package com.uts.customerhotel;

public class customercheckout {
    public static void main(String[] args) {
        Customer customer = new Customer("987654321", "Desta Atikananda", "Yogyakarta", "2112");
        customerCheckout(customer, "12:00 PM");
    }

    public static void customerCheckout(Customer customer, String waktu) {
        System.out.println("Proses Check-out:");
        customer.waktuCheckout(waktu);
    }
}
