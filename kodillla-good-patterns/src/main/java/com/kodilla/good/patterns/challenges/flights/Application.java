package com.kodilla.good.patterns.challenges.flights;

import java.util.Scanner;

public class Application {




    public static void main (String []args){
        FindFlights findFlights = new FindFlights();
        Scanner scan = new Scanner(System.in);

        System.out.println("Witaj w wyszukiwarce lotow, wyszukiwarka obsluguje lotniska: Wroclaw, Gdansk, Katowice, Krakow");
        System.out.println("Opcje:\n" +
                "1 - wszystkie loty na wybrane lotnisko\n" +
                "2 - wszystkie loty z wybranego lotniska\n" +
                "3 - wszystkie loty z jednego lotniska na drugie z mozliwa max 1 przesiadka\n");
        int option = scan.nextInt();

        if (option == 1){
            findFlights.findFlightsTo();
        } else if (option == 2){
            findFlights.findFlightsFrom();
        } else if (option == 3){
            findFlights.findFlightsFromTo();
        } else {
            System.out.println("Blad wywolania metody");
        }



    }
}
