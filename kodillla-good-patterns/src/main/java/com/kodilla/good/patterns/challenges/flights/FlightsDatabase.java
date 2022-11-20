package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class FlightsDatabase {
    Flight GdanskWroclaw1_1 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 11, 8, 0), "Wroclaw", LocalDateTime.of(2022, 9, 11, 9, 0));
    Flight GdanskWroclaw1_2 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 12, 8, 0), "Wroclaw", LocalDateTime.of(2022, 9, 12, 9, 0));
    Flight GdanskWroclaw1_3 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 13, 8, 0), "Wroclaw", LocalDateTime.of(2022, 9, 13, 9, 0));
    Flight GdanskWroclaw1_4 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 14, 8, 0), "Wroclaw", LocalDateTime.of(2022, 9, 14, 9, 0));
    Flight GdanskWroclaw1_5 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 15, 8, 0), "Wroclaw", LocalDateTime.of(2022, 9, 15, 9, 0));
    Flight GdanskWroclaw1_6 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 16, 8, 0), "Wroclaw", LocalDateTime.of(2022, 9, 16, 9, 0));
    Flight GdanskWroclaw1_7 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 17, 8, 0), "Wroclaw", LocalDateTime.of(2022, 9, 17, 9, 0));

    Flight GdanskWroclaw2_1 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 11, 18, 0), "Wroclaw", LocalDateTime.of(2022, 9, 11, 19, 0));
    Flight GdanskWroclaw2_2 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 12, 18, 0), "Wroclaw", LocalDateTime.of(2022, 9, 12, 19, 0));
    Flight GdanskWroclaw2_3 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 13, 18, 0), "Wroclaw", LocalDateTime.of(2022, 9, 13, 19, 0));
    Flight GdanskWroclaw2_4 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 14, 18, 0), "Wroclaw", LocalDateTime.of(2022, 9, 14, 19, 0));
    Flight GdanskWroclaw2_5 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 15, 18, 0), "Wroclaw", LocalDateTime.of(2022, 9, 15, 19, 0));
    Flight GdanskWroclaw2_6 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 16, 18, 0), "Wroclaw", LocalDateTime.of(2022, 9, 16, 19, 0));
    Flight GdanskWroclaw2_7 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 17, 18, 0), "Wroclaw", LocalDateTime.of(2022, 9, 17, 19, 0));

    Flight GdanskKrakow1_1 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 11, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 11, 11, 30));
    Flight GdanskKrakow1_2 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 12, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 12, 11, 30));
    Flight GdanskKrakow1_3 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 13, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 13, 11, 30));
    Flight GdanskKrakow1_4 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 14, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 14, 11, 30));
    Flight GdanskKrakow1_5 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 15, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 15, 11, 30));

    Flight GdanskKatowice1_1 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 12, 12, 0), "Katowice", LocalDateTime.of(2022, 9, 12, 13, 0));
    Flight GdanskKatowice1_2 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 14, 12, 0), "Katowice", LocalDateTime.of(2022, 9, 14, 13, 0));
    Flight GdanskKatowice1_3 = new Flight("Gdansk", LocalDateTime.of(2022, 9, 16, 12, 0), "Katowice", LocalDateTime.of(2022, 9, 16, 13, 0));

    Flight WroclawGdansk1_1 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 11, 8, 0), "Gdansk", LocalDateTime.of(2022, 9, 11, 9, 0));
    Flight WroclawGdansk1_2 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 12, 8, 0), "Gdansk", LocalDateTime.of(2022, 9, 12, 9, 0));
    Flight WroclawGdansk1_3 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 13, 8, 0), "Gdansk", LocalDateTime.of(2022, 9, 13, 9, 0));
    Flight WroclawGdansk1_4 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 14, 8, 0), "Gdansk", LocalDateTime.of(2022, 9, 14, 9, 0));
    Flight WroclawGdansk1_5 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 15, 8, 0), "Gdansk", LocalDateTime.of(2022, 9, 15, 9, 0));
    Flight WroclawGdansk1_6 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 16, 8, 0), "Gdansk", LocalDateTime.of(2022, 9, 16, 9, 0));
    Flight WroclawGdansk1_7 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 17, 8, 0), "Gdansk", LocalDateTime.of(2022, 9, 17, 9, 0));

    Flight WroclawGdansk2_1 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 11, 18, 0), "Gdansk", LocalDateTime.of(2022, 9, 11, 19, 0));
    Flight WroclawGdansk2_2 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 12, 18, 0), "Gdansk", LocalDateTime.of(2022, 9, 12, 19, 0));
    Flight WroclawGdansk2_3 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 13, 18, 0), "Gdansk", LocalDateTime.of(2022, 9, 13, 19, 0));
    Flight WroclawGdansk2_4 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 14, 18, 0), "Gdansk", LocalDateTime.of(2022, 9, 14, 19, 0));
    Flight WroclawGdansk2_5 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 15, 18, 0), "Gdansk", LocalDateTime.of(2022, 9, 15, 19, 0));
    Flight WroclawGdansk2_6 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 16, 18, 0), "Gdansk", LocalDateTime.of(2022, 9, 16, 19, 0));
    Flight WroclawGdansk2_7 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 17, 18, 0), "Gdansk", LocalDateTime.of(2022, 9, 17, 19, 0));


    Flight WroclawKrakow1_1 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 11, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 11, 11, 30));
    Flight WroclawKrakow1_2 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 12, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 12, 11, 30));
    Flight WroclawKrakow1_3 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 13, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 13, 11, 30));
    Flight WroclawKrakow1_4 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 14, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 14, 11, 30));
    Flight WroclawKrakow1_5 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 15, 10, 0), "Krakow", LocalDateTime.of(2022, 9, 15, 11, 30));

    Flight WroclawKatowice1_1 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 13, 11, 0), "Katowice", LocalDateTime.of(2022, 9, 13, 12, 0));
    Flight WroclawKatowice1_2 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 15, 11, 0), "Katowice", LocalDateTime.of(2022, 9, 15, 12, 0));
    Flight WroclawKatowice1_3 = new Flight("Wroclaw", LocalDateTime.of(2022, 9, 17, 11, 0), "Katowice", LocalDateTime.of(2022, 9, 17, 12, 0));



    public ArrayList<Flight> flightsList() {
        ArrayList<Flight> flightList = new ArrayList<>();
        flightList.add(GdanskWroclaw1_1);
        flightList.add(GdanskWroclaw1_2);
        flightList.add(GdanskWroclaw1_3);
        flightList.add(GdanskWroclaw1_4);
        flightList.add(GdanskWroclaw1_5);
        flightList.add(GdanskWroclaw1_6);
        flightList.add(GdanskWroclaw1_7);
        flightList.add(GdanskWroclaw2_1);
        flightList.add(GdanskWroclaw2_2);
        flightList.add(GdanskWroclaw2_3);
        flightList.add(GdanskWroclaw2_4);
        flightList.add(GdanskWroclaw2_5);
        flightList.add(GdanskWroclaw2_6);
        flightList.add(GdanskWroclaw2_7);
        flightList.add(GdanskKrakow1_1);
        flightList.add(GdanskKrakow1_2);
        flightList.add(GdanskKrakow1_3);
        flightList.add(GdanskKrakow1_4);
        flightList.add(GdanskKrakow1_5);
        flightList.add(GdanskKatowice1_1);
        flightList.add(GdanskKatowice1_2);
        flightList.add(GdanskKatowice1_3);
        flightList.add(WroclawGdansk1_1);
        flightList.add(WroclawGdansk1_2);
        flightList.add(WroclawGdansk1_3);
        flightList.add(WroclawGdansk1_4);
        flightList.add(WroclawGdansk1_5);
        flightList.add(WroclawGdansk1_6);
        flightList.add(WroclawGdansk1_7);
        flightList.add(WroclawGdansk2_1);
        flightList.add(WroclawGdansk2_2);
        flightList.add(WroclawGdansk2_3);
        flightList.add(WroclawGdansk2_4);
        flightList.add(WroclawGdansk2_5);
        flightList.add(WroclawGdansk2_6);
        flightList.add(WroclawGdansk2_7);
        flightList.add(WroclawKrakow1_1);
        flightList.add(WroclawKrakow1_2);
        flightList.add(WroclawKrakow1_3);
        flightList.add(WroclawKrakow1_4);
        flightList.add(WroclawKrakow1_5);
        flightList.add(WroclawKatowice1_1);
        flightList.add(WroclawKatowice1_2);
        flightList.add(WroclawKatowice1_3);

        return flightList;

    }
}
   /* public Flight getGdanskWroclaw1_1() {
        return GdanskWroclaw1_1;
    }

    public Flight getGdanskWroclaw1_2() {
        return GdanskWroclaw1_2;
    }

    public Flight getGdanskWroclaw1_3() {
        return GdanskWroclaw1_3;
    }

    public Flight getGdanskWroclaw1_4() {
        return GdanskWroclaw1_4;
    }

    public Flight getGdanskWroclaw1_5() {
        return GdanskWroclaw1_5;
    }

    public Flight getGdanskWroclaw1_6() {
        return GdanskWroclaw1_6;
    }

    public Flight getGdanskWroclaw1_7() {
        return GdanskWroclaw1_7;
    }

    public Flight getGdanskWroclaw2_1() {
        return GdanskWroclaw2_1;
    }

    public Flight getGdanskWroclaw2_2() {
        return GdanskWroclaw2_2;
    }

    public Flight getGdanskWroclaw2_3() {
        return GdanskWroclaw2_3;
    }

    public Flight getGdanskWroclaw2_4() {
        return GdanskWroclaw2_4;
    }

    public Flight getGdanskWroclaw2_5() {
        return GdanskWroclaw2_5;
    }

    public Flight getGdanskWroclaw2_6() {
        return GdanskWroclaw2_6;
    }

    public Flight getGdanskWroclaw2_7() {
        return GdanskWroclaw2_7;
    }

    public Flight getGdanskKrakow1_1() {
        return GdanskKrakow1_1;
    }

    public Flight getGdanskKrakow1_2() {
        return GdanskKrakow1_2;
    }

    public Flight getGdanskKrakow1_3() {
        return GdanskKrakow1_3;
    }

    public Flight getGdanskKrakow1_4() {
        return GdanskKrakow1_4;
    }

    public Flight getGdanskKrakow1_5() {
        return GdanskKrakow1_5;
    }

    public Flight getGdanskKatowice1_1() {
        return GdanskKatowice1_1;
    }

    public Flight getGdanskKatowice1_2() {
        return GdanskKatowice1_2;
    }

    public Flight getGdanskKatowice1_3() {
        return GdanskKatowice1_3;
    }

    public Flight getWroclawGdansk1_1() {
        return WroclawGdansk1_1;
    }

    public Flight getWroclawGdansk1_2() {
        return WroclawGdansk1_2;
    }

    public Flight getWroclawGdansk1_3() {
        return WroclawGdansk1_3;
    }

    public Flight getWroclawGdansk1_4() {
        return WroclawGdansk1_4;
    }

    public Flight getWroclawGdansk1_5() {
        return WroclawGdansk1_5;
    }

    public Flight getWroclawGdansk1_6() {
        return WroclawGdansk1_6;
    }

    public Flight getWroclawGdansk1_7() {
        return WroclawGdansk1_7;
    }

    public Flight getWroclawGdansk2_1() {
        return WroclawGdansk2_1;
    }

    public Flight getWroclawGdansk2_2() {
        return WroclawGdansk2_2;
    }

    public Flight getWroclawGdansk2_3() {
        return WroclawGdansk2_3;
    }

    public Flight getWroclawGdansk2_4() {
        return WroclawGdansk2_4;
    }

    public Flight getWroclawGdansk2_5() {
        return WroclawGdansk2_5;
    }

    public Flight getWroclawGdansk2_6() {
        return WroclawGdansk2_6;
    }

    public Flight getWroclawGdansk2_7() {
        return WroclawGdansk2_7;
    }

    public Flight getWroclawKrakow1_1() {
        return WroclawKrakow1_1;
    }

    public Flight getWroclawKrakow1_2() {
        return WroclawKrakow1_2;
    }

    public Flight getWroclawKrakow1_3() {
        return WroclawKrakow1_3;
    }

    public Flight getWroclawKrakow1_4() {
        return WroclawKrakow1_4;
    }

    public Flight getWroclawKrakow1_5() {
        return WroclawKrakow1_5;
    }

    public Flight getWroclawKatowice1_1() {
        return WroclawKatowice1_1;
    }

    public Flight getWroclawKatowice1_2() {
        return WroclawKatowice1_2;
    }

    public Flight getWroclawKatowice1_3() {
        return WroclawKatowice1_3;
    }

    */
