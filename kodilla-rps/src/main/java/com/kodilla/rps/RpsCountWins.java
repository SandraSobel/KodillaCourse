package com.kodilla.rps;

public class RpsCountWins {


    int playerWins;
    int computerWins;
    int draws;



    public void rpsCountWins(RpsRound rpsRound) {

        playerWins = rpsRound.getListOfWins().size();
        computerWins = rpsRound.getListOfLoss().size();
        draws = rpsRound.getListOfDraws().size();

        System.out.println("Ilosc wygranych gracza - " + playerWins +" \n"+
                           "Ilosc wygranych komputera - " + computerWins +" \n"+
                           "Ilosc remisow - " +draws + " \n");

        if (playerWins > computerWins) {
            System.out.println("KONIEC GRY\n Wynik koncowy, wygrana, gratulacje!\n");
        } else if (computerWins > playerWins) {
            System.out.println("KONIEC GRY\n Wynik koncowy - przegrana.\n");
        } else if (computerWins == playerWins) {
            System.out.println("KONIEC GRY\n Wynik koncowy - remis!\n");
        }
        rpsRound.roundAdd = 0;
    }
}
