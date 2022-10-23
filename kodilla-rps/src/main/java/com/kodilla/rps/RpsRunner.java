package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        RpsStart rpsStart = new RpsStart();
        RpsRound rpsRound = new RpsRound();
        RpsEnd rpsEnd = new RpsEnd();
        RpsCountWins rpsCountWins = new RpsCountWins();
        rpsStart.rpsStart();
        do {
            rpsRound.round(rpsStart);
        } while (rpsRound.getRoundAdd() < rpsStart.roundsNumber);
        System.out.println("Koniec gry " + rpsStart.getName() + ".\n");
        rpsCountWins.rpsCountWins(rpsRound);
    }
}


