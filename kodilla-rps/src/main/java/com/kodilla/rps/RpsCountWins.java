package com.kodilla.rps;

public class RpsCountWins {


    int playerWins;
    int computerWins;
    int draws;



    public void rpsCountWins(RpsRound rpsRound) {

        playerWins = rpsRound.getListOfWins().size();
        computerWins = rpsRound.getRoundAdd() - playerWins;
        draws = rpsRound.getRoundAdd() - playerWins - computerWins;

        System.out.println("Ilosc wygranych gracza - " + playerWins +" \n"+
                           "Ilosc wygranych komputera - " + computerWins +" \n"+
                           "Ilosc remisow - " +draws + " \n");

        if (playerWins > computerWins) {
            System.out.println("Wynik koncowy, wygrana, gratulacje!\n");
        } else if (computerWins > playerWins) {
            System.out.println("Wynik koncowy - przegrana.\n");
        } else if (computerWins == playerWins) {
            System.out.println("Wynik koncowy - remis!\n");
        }
    }
}
