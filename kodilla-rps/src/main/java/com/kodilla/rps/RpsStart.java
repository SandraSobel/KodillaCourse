package com.kodilla.rps;

import java.util.Scanner;

public class RpsStart {
    String name;
    int roundsNumber;
    public void rpsStart() {
        System.out.println("Gra Kamien-Papier-Nozyce \n Podaj swoje imie");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println("Witaj " + name);
        System.out.println("Zasady gry:\n"+
                "klawisz 1  zagranie \"kamien\",\n" +
                "klawisz 2  zagranie \"papier\",\n" +
                "klawisz 3  zagranie \"nozyce\",\n" +
                "klawisz x  zakończenie gry \n" +
                "klawisz n  uruchomienie gry od nowa \n");
        System.out.println("Podaj liczbe rund:");
        roundsNumber = scan.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getRoundsNumber() {
        return roundsNumber;
    }
}
