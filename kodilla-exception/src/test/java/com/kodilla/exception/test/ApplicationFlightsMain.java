package com.kodilla.exception.test;

public class ApplicationFlightsMain {
    public static void main (String[]args) {
        Flight flight1 = new Flight("Warszawa", "Krakow");
        Flight flight2 = new Flight("Poznan", "Bielsko-Biala");
        Flight flight3 = new Flight("Krakow", "Poznan");

        FlightsFinder flightsFinder1 = new FlightsFinder();
        try {
            flightsFinder1.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Route was not found on the map");
        }

        FlightsFinder flightsFinder2 = new FlightsFinder();
        try {
            flightsFinder2.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Route was not found on the map");
        }

        FlightsFinder flightsFinder3 = new FlightsFinder();
        try {
            flightsFinder3.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Route was not found on the map");
        }
    }
}
