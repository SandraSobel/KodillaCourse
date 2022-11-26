package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;

public class FlightsList {
    Flight GdanskWroclaw= new Flight("Gdansk",  "Wroclaw");
    Flight GdanskKrakow = new Flight("Gdansk", "Krakow");
    Flight GdanskKatowice = new Flight("Gdansk",  "Katowice");
    Flight WroclawGdansk = new Flight("Wroclaw","Gdansk");
    Flight WroclawKrakow = new Flight("Wroclaw",  "Krakow");
    Flight WroclawKatowice = new Flight("Wroclaw",  "Katowice");
    Flight KrakowWroclaw = new Flight("Krakow","Wroclaw");
    Flight KrakowGdansk = new Flight("Krakow","Gdansk");
    Flight KatowiceWroclaw = new Flight("Katowice","Wroclaw");
    Flight KatowiceGdansk = new Flight("Katowice","Gdansk");




    public ArrayList<Flight> flightsList() {
        ArrayList<Flight> flightList = new ArrayList<>();
        flightList.add(GdanskWroclaw);
        flightList.add(GdanskKrakow);
        flightList.add(GdanskKatowice);
        flightList.add(WroclawGdansk);
        flightList.add(WroclawKrakow);
        flightList.add(WroclawKatowice);
        flightList.add(KrakowWroclaw);
        flightList.add(KrakowGdansk);
        flightList.add(KatowiceWroclaw);
        flightList.add(KatowiceGdansk);



        return flightList;

    }
}
