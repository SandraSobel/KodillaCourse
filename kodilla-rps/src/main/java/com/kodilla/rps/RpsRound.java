package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RpsRound {
    String personPlay;
    String continueMove;
    String computerPlay;


    String kamien = "1";
    String papier = "2";
    String nozyce = "3";

    List<Integer> listOfWins = new ArrayList<>();
    List<Integer> listOfLoss = new ArrayList<>();
    List<Integer> listOfDraws = new ArrayList<>();
    int roundAdd = 0;
    Scanner scan = new Scanner(System.in);


    public void round(RpsStart rpsStart) {
    System.out.println(
            "Twoj ruch.\n" +
            "Kamien = 1, Paper = 2, Nozyce = 3, Zakoncz gre = x\n" +
            "Wprowadz swoj ruch: " );
    personPlay = scan.next();
    RpsComputerMove rpsComputerMove = new RpsComputerMove();
    computerPlay = rpsComputerMove.computerMove();


    if (personPlay.equals(computerPlay)){
        System.out.println("Remis.");
        listOfDraws.add(1);
    } else if (personPlay.equals(kamien)){
        if (computerPlay.equals(nozyce)){
             System.out.println("Kamien zgniata nozyce, wygrales.");
             listOfWins.add(1) ;
        }else if (computerPlay.equals(papier)){
              System.out.println("Papier przykrywa kamien, przegrales.");
              listOfLoss.add(1);
        }
    } else if (personPlay.equals(papier)) {
        if (computerPlay.equals(nozyce)){
             System.out.println("Nozyce tna papier, przegrales.");
            listOfLoss.add(1);
        } else if (computerPlay.equals(kamien)){
             System.out.println("Papier przykrywa kamien, wygrales.");
             listOfWins.add(1);
        }
    } else if (personPlay.equals(nozyce)) {
        if (computerPlay.equals(papier)) {
            System.out.println("Nozyce tna papier. wygrales.");
            listOfWins.add(1);
        } else if (computerPlay.equals(kamien)) {
            System.out.println("Kamien zgniata nozyce. przegrales");
            listOfLoss.add(1);
        }
    }else if (personPlay.equals("x")) {
        continueMove = "x";
    }else if (personPlay.equals("n")){
        continueMove = "n";
    } else {
        System.out.println("Nieprawidlowy ruch");
        roundAdd --;
    }
    roundAdd ++;
    System.out.println("Koniec rundy" + roundAdd+ ".");
    }

    public List<Integer> getListOfWins() {
        return listOfWins;
    }
    public List<Integer> getListOfLoss() {
        return listOfLoss;
    }
    public List<Integer> getListOfDraws() {
        return listOfDraws;
    }

    public int getRoundAdd() {
        return roundAdd;
    }

}
