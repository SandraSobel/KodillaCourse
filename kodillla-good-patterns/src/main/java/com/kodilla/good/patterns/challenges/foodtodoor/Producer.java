package com.kodilla.good.patterns.challenges.foodtodoor;

public class Producer {
    public String name;
    public String address;

    public Producer (String name, String address ){
        this.name=name;
        this.address = address;

    }

    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }
}
