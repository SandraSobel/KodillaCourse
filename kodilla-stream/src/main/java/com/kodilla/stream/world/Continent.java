package com.kodilla.stream.world;

import com.kodilla.stream.forumuser.ForumUser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Continent {
    private List<Country> countriesList= new ArrayList<>();


    public void addCountry(Country country){

        countriesList.add(country);

    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
}




