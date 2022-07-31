package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {


    public void findFlight(Flight flight) throws RouteNotFoundException {


        Map<String,Boolean> flightsMap = new HashMap<>();
        if (flight.getArrivalAirport() != null) {
            flightsMap.put(flight.getArrivalAirport(),true);
        }
        System.out.println(("Znaleziono lot do " + flight.getArrivalAirport()) + " z:" );
        for (Map.Entry<String,Boolean> entry: flightsMap.entrySet()){
            if (entry.getKey()==flight.getArrivalAirport() && entry.getValue()==true){
                System.out.println( "-" + flight.departureAirport);
            }

        }




    }

}
