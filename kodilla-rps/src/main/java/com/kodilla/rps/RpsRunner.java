package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    int roundCounter;
    public static void main(String[] args) {
        RpsStart rpsStart = new RpsStart();
        RpsRound rpsRound = new RpsRound();
        RpsEnd rpsEnd = new RpsEnd();
        RpsCountWins rpsCountWins = new RpsCountWins();

        rpsStart.rpsStart();

        do{
            rpsRound.round();
        } while (rpsRound.getRoundAdd()< rpsStart.roundsNumber);
        System.out.println("Koniec gry " + rpsStart.getName()+".\n");
        rpsEnd.rpsEnd();
    }
}
