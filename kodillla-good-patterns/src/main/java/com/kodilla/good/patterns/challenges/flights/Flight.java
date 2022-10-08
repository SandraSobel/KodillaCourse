package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;

public class Flight {

    public String depart;
    public String arrival;
    public LocalDateTime departTime;
    public LocalDateTime arrivalTime;

    public Flight (String depart, LocalDateTime departTime,String arrival, LocalDateTime arrivalTime){
        this.depart = depart;
        this.arrival = arrival;
        this.departTime = departTime;
        this.arrivalTime=arrivalTime;

    }

    public String getDepart() {
        return depart;
    }

    public String getArrival() {
        return arrival;
    }

    public LocalDateTime getDepartTime() {
        return departTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
}
