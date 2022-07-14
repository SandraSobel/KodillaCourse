package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    @DisplayName("Liczba ludnosci na swiecie")
    void WorldClassTest(){
        //given
        Country Poland = new Country(new BigDecimal("10000000000"));
        Country Ireland = new Country(new BigDecimal("10000000000"));
        Country China = new Country(new BigDecimal("10000000000"));
        Country Japan = new Country(new BigDecimal("20000000000"));
        Country Canada = new Country(new BigDecimal("10000000000"));
        Country UnitedStates = new Country(new BigDecimal("20000000000"));
        Country Mexico = new Country(new BigDecimal("10000000000"));

        Continent Europe = new Continent();
        Continent America = new Continent();
        Continent Asia = new Continent();

        World World = new World();

        //when
        Europe.addCountry(Poland);
        Europe.addCountry(Ireland);

        Asia.addCountry(China);
        Asia.addCountry(Japan);

        America.addCountry(Canada);
        America.addCountry(UnitedStates);
        America.addCountry(Mexico);

        World.addContinent(Europe);
        World.addContinent(Asia);
        World.addContinent(America);


        //then
        Assertions.assertEquals(World.getPeopleQuantity(),new BigDecimal("90000000000"));

    }
}
