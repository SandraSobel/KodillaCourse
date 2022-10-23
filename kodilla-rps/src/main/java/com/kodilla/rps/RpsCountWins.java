package com.kodilla.rps;

public class RpsCountWins {

    RpsStart rpsStart = new RpsStart();
    RpsRound rpsRound = new RpsRound();
    int playerWins;
    int computerWins;
    boolean isPlayerWon = false;
    boolean isComputerWon = false;
    boolean isDraw =false;
    String resultString;

    public void rpsCountWins() {
        playerWins = rpsRound.getListOfWins().size();
        computerWins = rpsRound.getRoundAdd() - playerWins;
        if (playerWins > computerWins) {
            isPlayerWon = true;
            System.out.println("Gratulacje, wygralas/wygrales.\n");
        } else if (computerWins > playerWins) {
            isComputerWon = true;
            System.out.println("Przykro mi, przegralas/przegrales.\n");
        } else if (computerWins == playerWins) {
            isDraw = true;
            System.out.println("Remis!\n");
        }
    }
}
