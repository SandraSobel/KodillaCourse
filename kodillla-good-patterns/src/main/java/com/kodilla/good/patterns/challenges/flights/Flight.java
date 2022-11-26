package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public final class Flight {

    public final String depart;
    public final String arrival;


    public Flight (final String depart,final String arrival){
        this.depart = depart;
        this.arrival = arrival;

    }

    public String getDepart() {
        return depart;
    }

    public String getArrival() {
        return arrival;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(depart, flight.depart) && Objects.equals(arrival, flight.arrival) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(depart, arrival);
    }

    @Override
    public String toString(){
        return "Wylot: " + depart +",  / Przylot: " + arrival ;
    }
}
