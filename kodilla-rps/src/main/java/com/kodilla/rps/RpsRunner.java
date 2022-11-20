package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        RpsStart rpsStart = new RpsStart();
        RpsRound rpsRound = new RpsRound();
        RpsCountWins rpsCountWins = new RpsCountWins();
        String nowaGra;

        Scanner scan = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            rpsStart.rpsStart();
            do {
                rpsRound.round(rpsStart);
            } while (rpsRound.getRoundAdd() < rpsStart.roundsNumber);

            System.out.println("Koniec gry " + rpsStart.getName() + ".\n");
            rpsCountWins.rpsCountWins(rpsRound);
            System.out.println("Aby rozpoczac nowa gre wybierz 'n', aby zakonczyc wybierz 'x' lub jakikolwiek inny znak");
            nowaGra = scan.next();

            if (nowaGra.equals("n")){
                System.out.println("Nowa gra");
                for (int i=0; i<rpsRound.listOfDraws.size(); i++){
                    rpsRound.listOfDraws.remove(i);
                }
                for (int i=0; i<rpsRound.listOfLoss.size(); i++){
                    rpsRound.listOfLoss.remove(i);
                }
                for (int i=0; i<rpsRound.listOfWins.size(); i++){
                    rpsRound.listOfWins.remove(i);
                }
                rpsRound.roundAdd=0;

            }
            else if (rpsRound.personPlay.equals("x")) break;
            if (!nowaGra.equals("n")) break;

           }


    }
}




