package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RpsRound {
    String personPlay;
    String personPlay2;
    String computerPlay;

    String kamien = "1";
    String papier = "2";
    String nozyce = "3";
    String nowaGra = "n";
    String koniecGry = "x";
    List<Integer> listOfWins = new ArrayList<>();
    int roundAdd = 0;
    Scanner scan = new Scanner(System.in);
    RpsStartNewGame rpsStartNewGame = new RpsStartNewGame();
    RpsEndCurrentGame rpsEndCurrentGame = new RpsEndCurrentGame();

    public void round(RpsStart rpsStart) {
    System.out.println(
            "Twoj ruch.\n" +
            "Kamien = 1, Paper = 2, Nozyce = 3.\n" +
            "Wprowadz swoj ruch: " );
    personPlay = scan.next();
    RpsComputerMove rpsComputerMove = new RpsComputerMove();
    computerPlay = rpsComputerMove.computerMove();


    if (personPlay.equals(nowaGra)) {
        System.out.println("Czy napewno chcesz zakonczyc aktualna gre aby rozpoczac nowa?\n" +
                "Odpowiedz tak aby potwierdzic lub nie aby anulowac");
        personPlay2 = scan.next();
        if (personPlay2.equals("tak")){
            //rozpocznij nowa gre;
        } else if(personPlay2.equals("nie")){
            roundAdd --;
        }


    } else if (personPlay.equals(koniecGry)) {
        System.out.println("Czy napewno chcesz calkowicie zakonczyc gre?\n" +
                "Odpowiedz tak aby potwierdzic lub nie aby anulowac");
        personPlay2 = scan.next();
        if (personPlay2.equals("tak")){
            //przejdz do konca programu;
        } else if(personPlay2.equals("nie")){
            roundAdd --;
        }

    } else if (personPlay.equals(computerPlay)){
        System.out.println("Remis.");
    } else if (personPlay.equals(kamien)){
        if (computerPlay.equals(nozyce)){
             System.out.println("Kamien zgniata nozyce, wygrales.");
             listOfWins.add(1) ;
        }else if (computerPlay.equals(papier)){
              System.out.println("Papier przykrywa kamien, przegrales.");
        }
    } else if (personPlay.equals(papier)) {
        if (computerPlay.equals(nozyce)){
             System.out.println("Nozyce tna papier, przegrales.");
        } else if (computerPlay.equals(kamien)){
             System.out.println("Papier przykrywa kamien, wygrales.");
             listOfWins.add(1);
        }
    } else if (personPlay.equals(nozyce)){
        if (computerPlay.equals(papier)){
             System.out.println("Nozyce tna papier. wygrales.");
             listOfWins.add(1);
        } else if (computerPlay.equals(kamien)){
             System.out.println("Kamien zgniata nozyce. przegrales");}
    }
    roundAdd ++;
    }

    public List<Integer> getListOfWins() {
        return listOfWins;
    }

    public int getRoundAdd() {
        return roundAdd;
    }
}
