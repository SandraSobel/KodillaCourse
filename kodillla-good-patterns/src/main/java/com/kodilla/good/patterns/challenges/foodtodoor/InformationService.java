package com.kodilla.good.patterns.challenges.foodtodoor;

import com.kodilla.good.patterns.challenges.allegro.User;

public class InformationService {
    public void inform(OrderRequest orderRequest) {
        System.out.println("Zamowienie nr " + orderRequest.getOrderNo() + " zostalo przyjete");
        System.out.println("Szczegoly zamowienia:");
        System.out.println("Klient: " + orderRequest.getClient().getName());
        System.out.println("Producent: " + orderRequest.getProducer().getName());
        System.out.println("Kurier: " + orderRequest.getSupplier().getName());
        System.out.println("Data zamowienia: " + orderRequest.getOrderDate().toString());
    }
}
