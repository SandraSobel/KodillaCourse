package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRound {

    public void round() {
    String personPlay;
    String computerPlay = "";
    int computerInt;


    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    System.out.println("Twój ruch.\n" + "Kamien = K, Paper" +
                "= P, Nozyce = N.");
    System.out.println();

    computerInt = generator.nextInt(3)+1;

            if (computerInt == 1)
    computerPlay = "K";
        else if (computerInt == 2)
    computerPlay = "P";
        else if (computerInt == 3)
    computerPlay = "N";


    //Get player's play from input-- note that this is
    // stored as a string
        System.out.println("Wprowadz swoj ruch: ");
    personPlay = scan.next();

    //Make player's play uppercase for ease of comparison
    personPlay = personPlay.toUpperCase();

    //Print computer's play
        System.out.println("Ruch komputera to: " + computerPlay);


    //See who won. Use nested ifs

        if (personPlay.equals(computerPlay))
            System.out.println("Remis.");
        else if (personPlay.equals("K"))
                if (computerPlay.equals("N"))
                System.out.println("Kamien zgniata nozyce, wygrales.");
            else if (computerPlay.equals("P"))
                    System.out.println("Papier przykrywa kamien, przegrales.");
            else if (personPlay.equals("P"))
                    if (computerPlay.equals("N"))
                    System.out.println("Nozyce tną papier, przegrales.");
                else if (computerPlay.equals("K"))
                        System.out.println("Papier przykrywa kamien, wygrales.");
                else if (personPlay.equals("N"))
                        if (computerPlay.equals("P"))
                        System.out.println("Nożyce tna papier. wygrales.");
                    else if (computerPlay.equals("K"))
                            System.out.println("Kamien zgniata nozyce. przegrales");

    }
}
