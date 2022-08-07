package com.kodilla.good.patterns.challenges.foodtodoor;

public class DataBase {
    // Producers:
    Producer ExtraFoodShop = new Producer("ExtraFoodShop","adres223");
    Producer HealthyShop = new Producer("HealthyShop","adres321");
    Producer GlutenFreeShop = new Producer("GlutenFreeShop","adres981");
    Producer NewProducer = new Producer("New Producer","adres122");

    //Suppliers:
    Supplier kurier1 = new Supplier("kurier1");
    Supplier kurier2 = new Supplier("Kurier2");
    Supplier kurier3 = new Supplier("kurier3");

    //clients:
    Client AdamNowak = new Client ("Adam Nowak","adres1");
    Client RobertKowalski = new Client ("Robert Kowalski", "adres2");
    Client MonikaKuczera = new Client ("Monika Kuczera", "adres3");
    Client PatrycjaWalica = new Client ("Patrycja Walica", "adres4");



    public Producer getExtraFoodShop() {
        return ExtraFoodShop;
    }

    public Producer getHealthyShop() {
        return HealthyShop;
    }

    public Producer getGlutenFreeShop() {
        return GlutenFreeShop;
    }

    public Producer getNewProducer() {
        return NewProducer;
    }

    public Supplier getKurier1() {
        return kurier1;
    }

    public Supplier getKurier2() {
        return kurier2;
    }

    public Supplier getKurier3() {
        return kurier3;
    }

    public Client getAdamNowak() {
        return AdamNowak;
    }

    public Client getRobertKowalski() {
        return RobertKowalski;
    }

    public Client getMonikaKuczera() {
        return MonikaKuczera;
    }

    public Client getPatrycjaWalica() {
        return PatrycjaWalica;
    }


}
