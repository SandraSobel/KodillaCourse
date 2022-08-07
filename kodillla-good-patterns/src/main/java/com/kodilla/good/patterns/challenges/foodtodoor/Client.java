package com.kodilla.good.patterns.challenges.foodtodoor;

public class Client {
    public String name;
    public String address;

    public Client (String name, String address){
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
