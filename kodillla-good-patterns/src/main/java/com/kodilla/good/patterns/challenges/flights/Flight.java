package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Flight {

    public final String depart;
    public final String arrival;
    public final LocalDateTime departTime;
    public final LocalDateTime arrivalTime;//wyrzucic daty

    public Flight (final String depart,final LocalDateTime departTime,final String arrival,final LocalDateTime arrivalTime){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(depart, flight.depart) && Objects.equals(arrival, flight.arrival) && Objects.equals(departTime, flight.departTime) && Objects.equals(arrivalTime, flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depart, arrival, departTime, arrivalTime);
    }

    @Override
    public String toString(){
        return "Wylot: " + depart +", " + departTime + " / Przylot: " + arrival + ", "+arrivalTime;
    }
}
