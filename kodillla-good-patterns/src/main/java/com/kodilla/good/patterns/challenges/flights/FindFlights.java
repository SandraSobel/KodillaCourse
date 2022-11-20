package com.kodilla.good.patterns.challenges.flights;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFlights {
    String depart;
    String arrival;
    Scanner scan = new Scanner(System.in);
    FlightsDatabase flightsDatabase = new FlightsDatabase();


    public void findFlightsFrom() {
        System.out.println("Wpisz nazwe lotniska z ktorego chcesz wyleciec- wpisz nazwe z duzej litery z pominieciem polskich znakow");
        depart = scan.next();

        System.out.println("Wyszukane loty:");
        flightsDatabase.flightsList().stream().
                filter(flight -> flight.getDepart().equals(depart)).forEach(System.out::println);
    }

    public void findFlightsTo() {

        System.out.println("Wpisz nazwe lotniska do ktorego chcesz poleciec - wpisz nazwe z duzej litery z pominieciem polskich znakow");
        arrival = scan.next();

        System.out.println("Wyszukane loty:");
        flightsDatabase.flightsList().stream().filter(flight2 -> flight2.getArrival().equals(arrival)).forEach(System.out::println);

    }

    public void findFlightsFromTo() {

        System.out.println("Wpisz nazwe lotniska z ktorego chcesz wyleciec- wpisz nazwe z duzej litery z pominieciem polskich znakow");
        depart = scan.next();
        System.out.println("Wpisz nazwe lotniska do ktorego chcesz poleciec - wpisz nazwe z duzej litery z pominieciem polskich znakow");
        arrival = scan.next();

        System.out.println("Wyszukane loty bez przesiadki:");
        flightsDatabase.flightsList().stream().
                filter(flight -> flight.getDepart().equals(depart)).
                filter(flight2 -> flight2.getArrival().equals(arrival)).forEach(System.out::println);
        System.out.println("Wyszukane loty z przesiadka:");


       /* for (int i = 1;
             i < flightsDatabase.flightsList().stream().
                filter(flight -> flight.getDepart().equals(depart)).collect(Collectors.toList()).size();
             i++) {
            int finalI = i;
            System.out.println("Lot pierwszy:");
            System.out.println(flightsDatabase.flightsList().stream().
                    filter(flight -> flight.getDepart().equals(depart)).collect(Collectors.toList()).get(i));
            System.out.println("(Lot drugi (jezeli pole ponizej jest puste oznacza to ze ten lot nie ma przesiadki ktora pomoze Ci dostac sie do" + arrival + ")");
            flightsDatabase.flightsList().stream()
                    .filter(flight -> flight.getDepart().equals(flightsDatabase.flightsList().get(finalI).getArrival()))
                    .filter(flight -> flight.getArrival().equals(arrival))
                    .filter(flight -> flight.getDepartTime().isAfter(flightsDatabase.flightsList().get(finalI).getArrivalTime()))
                    .filter(flight -> flight.getDepartTime().isBefore(flightsDatabase.flightsList().get(finalI).getArrivalTime().plusDays(1)))
                    .forEach(System.out::println);
            System.out.println();
            */
        for (int i = 1; i < flightsDatabase.flightsList().size(); i++) {

            if (flightsDatabase.flightsList().get(i).depart.equals(depart) && !flightsDatabase.flightsList().get(i).arrival.equals(arrival)) {
                System.out.println("Lot pierwszy:");
                System.out.println(flightsDatabase.flightsList().get(i));



                }

            }

        }
    }


