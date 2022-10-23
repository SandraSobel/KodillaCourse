package com.kodilla.rps;

import java.util.Scanner;

public class RpsStartNewGame {
    Scanner scan = new Scanner(System.in);
    String personPlay;


    public void startNewGame() {
        System.out.println("Czy napewno chcesz zakonczyc aktualna gre?\n" +
                "Odpowiedz tak aby potwierdzic lub nie aby anulowac");
        personPlay = scan.next();
        if (personPlay.equals("tak")) {
            RpsStart rpsStart = new RpsStart();
            RpsRound rpsRound = new RpsRound();
            RpsEnd rpsEnd = new RpsEnd();
            rpsStart.rpsStart();
            do {
                rpsRound.round();
            } while (rpsRound.getRoundAdd() < rpsStart.roundsNumber);
            System.out.println("Dziekujemy za gre " + rpsStart.getName() + ".\n");
            rpsEnd.rpsEnd();
        }
    }
}
