package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {
    private final List<Continent> continentsList= new ArrayList<>();
    public void addContinent(Continent continent) {
        continentsList.add(continent);
    }

    public List<Continent> getContinentsList() {
        return continentsList;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = continentsList.stream()
                .flatMap(continent -> continent.getCountriesList().stream()
                        .map(country -> country.getPeopleQuantity()))
                .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current)) ;
                return totalPeople;
    }


}
