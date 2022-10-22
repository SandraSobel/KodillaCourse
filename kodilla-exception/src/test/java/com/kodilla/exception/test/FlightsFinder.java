package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> isItPossibleToFly = new HashMap<>();
        isItPossibleToFly.put("Warszawa",true);
        isItPossibleToFly.put("Krakow",true);
        isItPossibleToFly.put("Katowice",true);
        isItPossibleToFly.put("Bielsko-Biala",false);
        for (Map.Entry<String,Boolean> entry: isItPossibleToFly.entrySet()){
            if (entry.getKey() == flight.getArrivalAirport()) {
               System.out.println("Flight to " + flight.getArrivalAirport() + "is possible");
            } else if (entry.getValue() == false){
               System.out.println("Flight to " + flight.getArrivalAirport() + "is not possible");
            } else {
               throw new RouteNotFoundException("Route was not found on the map");
            }
        }
    }
}

