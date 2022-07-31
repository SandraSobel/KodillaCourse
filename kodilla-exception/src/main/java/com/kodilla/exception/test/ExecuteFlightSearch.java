package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class ExecuteFlightSearch {

    public static void main (String []args){

        Flight DUBWRO = new Flight("Dublin","Wroclaw");
        Flight DUBKRA = new Flight("Dublin","Krakow");
        Flight DUBKAT = new Flight("Dublin",null);
        Flight SHAKAT = new Flight("Shannon","Katowice");
        Flight KATSHA = new Flight("Katowice","Shannon");
        Flight KATDUB = new Flight("Katowice","Dublin");
        Flight KRADUB = new Flight("Krakow","Dublin");
        Flight WRODUB = new Flight("Wroclaw","Dublin");

        FlightSearch flightSearch = new FlightSearch();
       flightSearch.findFlight(DUBKAT);





    }
}
