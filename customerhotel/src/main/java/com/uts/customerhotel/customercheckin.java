package com.uts.customerhotel;

public class customercheckin {
    public static void main(String[] args) {
        Customer customer = new Customer("987654321", "Desta Atikananda", "Yogyakarta", "2112");
        customerCheckin(customer, "08:00 AM");
    }

    public static void customerCheckin(Customer customer, String waktu) {
        System.out.println("Proses Check-in:");
        customer.waktuCheckin(waktu);
    }
}
